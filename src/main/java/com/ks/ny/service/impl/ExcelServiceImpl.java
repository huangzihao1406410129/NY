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
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
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
            private static final int BATCH_COUNT = 10;
            int a=0;
            int row=0;
            List<WarrantyNumberInventory> WarrantyNumberInventoryList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
            @Override
            public void invoke(WarrantyNumberInventoryVO data, AnalysisContext analysisContext) {
                //复制数据
                if(data.getObjectId()!=null&&!"".equals(data.getObjectId())){
                    BeanUtils.copyProperties(data,warrantyNumberInventory);
                    WarrantyNumberInventoryList.add(warrantyNumberInventory);
                }
                //超出数量限制清空list
                if (WarrantyNumberInventoryList.size()>=BATCH_COUNT){
                    //插入数据
                    a++;
                    row+=warrantyNumberInventoryDao.insertOrUpdateBatch(WarrantyNumberInventoryList);
                    WarrantyNumberInventoryList=ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
                    System.out.println("第"+a+"次插入更新"+row+"数据，清除缓存");
                }

            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("解析结束");
            }
        }).sheet().doRead();
//        InputStream inputStream2 = file.getInputStream();
//
//        EasyExcel.read(inputStream2, SteelPipeExcelVO.class, new ReadListener<SteelPipeExcelVO>() {
//            private static final int BATCH_COUNT = 50;
//            int b=0;
//            /*
//             * 缓存的数据
//             */
//            private List<SteelPipe> steelPipeList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
//            @Override
//            public void invoke(SteelPipeExcelVO steelPipeExcelVO, AnalysisContext analysisContext) {
//
//                if(steelPipeExcelVO.getName()!=null&&!"".equals(steelPipeExcelVO.getName())) {
//                    BeanUtils.copyProperties(steelPipeExcelVO, steelPipe);
//                    steelPipeList.add(steelPipe);
//                }
//                if (steelPipeList.size() >= BATCH_COUNT) {
//                    int row =steelPipeDao.insertOrUpdateBatch(steelPipeList);
//                    // 存储完成清理 list
//                    steelPipeList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
//                    System.out.println("第"+b+"次插入更新"+row+"数据，清除缓存");
//                }
//            }
//
//            @Override
//            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
//                System.out.println("所有数据解析完成！");
//            }
//        }).sheet().doRead();
        return null;

    }
}
