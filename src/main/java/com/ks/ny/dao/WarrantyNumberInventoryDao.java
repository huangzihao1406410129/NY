package com.ks.ny.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.ks.ny.entity.WarrantyNumberInventory;

/**
 * 质保号库存(WarrantyNumberInventory)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-25 13:23:04
 */

@Mapper
public interface WarrantyNumberInventoryDao extends BaseMapper<WarrantyNumberInventory> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<WarrantyNumberInventory> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<WarrantyNumberInventory> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<WarrantyNumberInventory> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<WarrantyNumberInventory> entities);

}

