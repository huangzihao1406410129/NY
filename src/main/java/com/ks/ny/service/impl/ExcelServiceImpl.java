package com.ks.ny.service.impl;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.ks.ny.dao.SteelPipeDao;
import com.ks.ny.dao.WarrantyNumberInventoryDao;
import com.ks.ny.entity.SteelPipe;
import com.ks.ny.entity.WarrantyNumberInventory;
import com.ks.ny.entity.vo.SteelPipeExcelVO;
import com.ks.ny.entity.vo.WarrantyNumberInventoryVO;
import com.ks.ny.service.ExcelService;
import com.ks.ny.service.SteelPipeService;
import com.ks.ny.service.WarrantyNumberInventoryService;
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
    @Autowired
    WarrantyNumberInventoryService warrantyNumberInventoryService;
    @Autowired
    SteelPipeService steelPipeService;

    List<WarrantyNumberInventory> WarrantyNumberInventoryList =new ArrayList<>();
    List<SteelPipe> steelPipeList=new ArrayList<>();
    @Override
    public Map excelParse(MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();
        List<WarrantyNumberInventoryVO> objects = new ArrayList<>();
        List<SteelPipeExcelVO> objects1 = new ArrayList<>();
        EasyExcel.read(inputStream, WarrantyNumberInventoryVO.class, new ReadListener<WarrantyNumberInventoryVO>() {
            WarrantyNumberInventory warrantyNumberInventory=null;

            @Override
            public void invoke(WarrantyNumberInventoryVO data, AnalysisContext analysisContext) {

                //复制数据
                if(data.getObjectId()!=null&&!"".equals(data.getObjectId())) {
                    warrantyNumberInventory=new WarrantyNumberInventory();
                    BeanUtils.copyProperties(data, warrantyNumberInventory);
                    WarrantyNumberInventoryList.add(warrantyNumberInventory);
                }
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
               warrantyNumberInventoryService.saveOrUpdateBatch(WarrantyNumberInventoryList,100);
                System.out.println("解析结束");
            }
        }).sheet().doRead();
        //
        InputStream inputStream2 = file.getInputStream();

        EasyExcel.read(inputStream2, SteelPipeExcelVO.class, new ReadListener<SteelPipeExcelVO>() {
            /*
             * 缓存的数据
             */
            SteelPipe steelPipe=null;
            @Override
            public void invoke(SteelPipeExcelVO steelPipeExcelVO, AnalysisContext analysisContext) {
                if(steelPipeExcelVO.getName()!=null&&!"".equals(steelPipeExcelVO.getName())) {
                    steelPipe = new SteelPipe();
                    BeanUtils.copyProperties(steelPipeExcelVO, steelPipe);
                    steelPipeList.add(steelPipe);
                }
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                steelPipeService.saveOrUpdateBatch(steelPipeList,100);
                System.out.println("所有数据解析完成！");
            }
        }).sheet().doRead();
        return null;

    }
}
