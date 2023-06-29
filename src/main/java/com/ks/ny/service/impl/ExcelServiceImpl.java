package com.ks.ny.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import com.alibaba.fastjson.JSON;
import com.ks.ny.entity.vo.ExcelReadVO;
import com.ks.ny.entity.vo.SteelPipeExcelVO;
import com.ks.ny.service.ExcelService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service("excelService")
public class ExcelServiceImpl implements ExcelService {
    @Override
    public String excelParse(MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();

        EasyExcel.read(inputStream, SteelPipeExcelVO.class, new ReadListener<SteelPipeExcelVO>() {
            private static final int BATCH_COUNT = 50;
            /**
             * 缓存的数据
             */
            private List<SteelPipeExcelVO> cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
            @Override
            public void invoke(SteelPipeExcelVO steelPipeExcelVO, AnalysisContext analysisContext) {
                cachedDataList.add(steelPipeExcelVO);
                System.out.println(JSON.toJSONString(cachedDataList.get(cachedDataList.size()-1)));
                if (cachedDataList.size() >= BATCH_COUNT) {
                    // 存储完成清理 list
                    System.out.println("清除缓存");
                    cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
                }
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("所有数据解析完成！");
            }
        }).sheet().doRead();
        return  file.getOriginalFilename();

    }
}
