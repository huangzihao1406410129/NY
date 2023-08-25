package com.ks.ny.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ks.ny.dao.WarrantyNumberInventoryDao;
import com.ks.ny.entity.WarrantyNumberInventory;
import com.ks.ny.service.WarrantyNumberInventoryService;
import org.springframework.stereotype.Service;

/**
 * 质保号库存(WarrantyNumberInventory)表服务实现类
 *
 * @author makejava
 * @since 2023-08-25 09:52:37
 */
@Service("warrantyNumberInventoryService")
public class WarrantyNumberInventoryServiceImpl extends ServiceImpl<WarrantyNumberInventoryDao, WarrantyNumberInventory> implements WarrantyNumberInventoryService {

}

