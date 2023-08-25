package com.ks.ny.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import com.ks.ny.dao.SteelPipeDao;
import com.ks.ny.dao.WarrantyNumberInventoryDao;
import com.ks.ny.entity.SteelPipe;
import com.ks.ny.entity.WarrantyNumberInventory;
import com.ks.ny.entity.vo.SteelPipeExcelVO;
import com.ks.ny.entity.vo.WarrantyNumberInventoryVO;
import com.ks.ny.service.ExcelService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.beans.JavaBean;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@Service("excelService")
public class ExcelServiceImpl implements ExcelService {
    @Autowired
    SteelPipeDao steelPipeDao;
    @Autowired
    WarrantyNumberInventoryDao warrantyNumberInventoryDao;

    @Override
    public Map excelParse(MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();
        List<WarrantyNumberInventoryVO> objects = new ArrayList<>();
        List<SteelPipeExcelVO> objects1 = new ArrayList<>();


        SteelPipe steelPipe = new SteelPipe();
        WarrantyNumberInventory warrantyNumberInventory = new WarrantyNumberInventory();
        EasyExcel.read(inputStream, WarrantyNumberInventoryVO.class, new ReadListener<WarrantyNumberInventoryVO>() {
            private static final int BATCH_COUNT = 200;
            List<WarrantyNumberInventory> WarrantyNumberInventoryList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
            List<WarrantyNumberInventoryVO> cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
            @Override
            public void invoke(WarrantyNumberInventoryVO data, AnalysisContext analysisContext) {
                cachedDataList.add(data);
                //复制数据
                BeanUtils.copyProperties(data,warrantyNumberInventory);
                WarrantyNumberInventoryList.add(warrantyNumberInventory);
                //超出数量限制清空list
                if (cachedDataList.size()>BATCH_COUNT){
                    //插入数据
                    warrantyNumberInventoryDao.insertOrUpdateBatch(WarrantyNumberInventoryList);
                    cachedDataList=ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
                    WarrantyNumberInventoryList=ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
                }

            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("解析结束");
            }
        }).sheet().doRead();
        InputStream inputStream2 = file.getInputStream();

        EasyExcel.read(inputStream2, SteelPipeExcelVO.class, new ReadListener<SteelPipeExcelVO>() {
            private static final int BATCH_COUNT = 50;
            /*
             * 缓存的数据
             */
            private List<SteelPipeExcelVO> cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
            private List<SteelPipe> steelPipeList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
            @Override
            public void invoke(SteelPipeExcelVO steelPipeExcelVO, AnalysisContext analysisContext) {
                cachedDataList.add(steelPipeExcelVO);

                BeanUtils.copyProperties(steelPipeExcelVO,steelPipe);
                steelPipeList.add(steelPipe);
                if (cachedDataList.size() >= BATCH_COUNT) {
                    steelPipeDao.insertOrUpdateBatch(steelPipeList);
                    // 存储完成清理 list
                    System.out.println("清除缓存");
                    cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
                    steelPipeList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
                }
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("所有数据解析完成！");
            }
        }).sheet().doRead();
        return null;

    }
}
