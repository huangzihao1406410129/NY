package com.ks.ny.entity.vo;

import com.alibaba.excel.annotation.ExcelProperty;

import java.math.BigDecimal;


public class SteelPipeExcelVO {

    @ExcelProperty("记录ID(不可修改)")
    private String objectId;
    //数据标题
    @ExcelProperty("数据标题(不可修改)")
    private String name;
    //物料状态
    @ExcelProperty("物料状态")
    private String itemStatus;
    //标准件是否
    @ExcelProperty("标准件")
    private String standardYn;
    //质保书已确认
    @ExcelProperty("质保书已确认")
    private String warrantyConfirmed;
    //原材料归属
    @ExcelProperty("原材料归属")
    private String ascription;
    //标准
    @ExcelProperty("标准")
    private String standard;
    //材质
    @ExcelProperty("材质")
    private String itemMaterial;
    //通径
    @ExcelProperty("通径")
    private String f0000039;
    //壁厚
    @ExcelProperty("壁厚")
    private String f0000040;
    //非标_通径
    @ExcelProperty("非标_通径")
    private String f0000048;
    //非标_壁厚
    @ExcelProperty("非标_壁厚")
    private String f0000049;
    //物料代码
    @ExcelProperty("物料代码")
    private String itemCode;
    //物料全称
    @ExcelProperty("物料全称")
    private String itemFullName;
    //基础标准号
    @ExcelProperty("基础标准号")
    private String baseStandardNumber;
    //描述
    @ExcelProperty("描述")
    private String description;
    //材料
    @ExcelProperty("材料")
    private String material;
    //规格
    @ExcelProperty("规格/mm")
    private String specification;
    //通径规格
    @ExcelProperty("通径规格")
    private String diameterSpecifications;
    //壁厚规格
    @ExcelProperty("壁厚规格")
    private String wallThicknessSpecifications;
    //单位
    @ExcelProperty("单位")
    private String unit;
    //外径/inch
    @ExcelProperty("外径/inch")
    private String f0000045;
    //理论重量/kg/m
    @ExcelProperty("理论重量/kg/m")
    private Double theoreticalWeight;
    //外径/mm
    @ExcelProperty("外径/mm")
    private String f0000020;
    //壁厚/mm
    @ExcelProperty("壁厚/mm")
    private String f0000023;
    //金蝶规格型号
    @ExcelProperty("金蝶规格型号")
    private String f0000118;
    //长/mm
    @ExcelProperty("长/mm")
    private Integer length;
    //宽/mm
    @ExcelProperty("宽/mm")
    private Integer width;

    //入库总数量/mm
    @ExcelProperty("入库总数量/mm")
    private Integer inboundLength;
    //流程进行中的数量/mm
    @ExcelProperty("流程进行中的数量/mm")
    private Integer processLength;
    //消耗的数量/mm
    @ExcelProperty("消耗的数量/mm")
    private Integer quantityConsumed;
    //剩余库存数量/mm
    @ExcelProperty("剩余库存数量/mm")
    private Integer inventoryLength;
    //理论剩余重量/kg
    @ExcelProperty("理论剩余重量/kg")
    private Integer inventoryWeight;
    //质保号库存数量mm
    @ExcelProperty("质保号库存数量mm")
    private Integer warrantyNumberLength;


    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String parentObjectId) {
        this.objectId = parentObjectId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getStandardYn() {
        return standardYn;
    }

    public void setStandardYn(String standardYn) {
        this.standardYn = standardYn;
    }

    public String getWarrantyConfirmed() {
        return warrantyConfirmed;
    }

    public void setWarrantyConfirmed(String warrantyConfirmed) {
        this.warrantyConfirmed = warrantyConfirmed;
    }

    public String getAscription() {
        return ascription;
    }

    public void setAscription(String ascription) {
        this.ascription = ascription;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getItemMaterial() {
        return itemMaterial;
    }

    public void setItemMaterial(String itemMaterial) {
        this.itemMaterial = itemMaterial;
    }

    public String getF0000039() {
        return f0000039;
    }

    public void setF0000039(String f0000039) {
        this.f0000039 = f0000039;
    }

    public String getF0000040() {
        return f0000040;
    }

    public void setF0000040(String f0000040) {
        this.f0000040 = f0000040;
    }

    public String getF0000048() {
        return f0000048;
    }

    public void setF0000048(String f0000048) {
        this.f0000048 = f0000048;
    }

    public String getF0000049() {
        return f0000049;
    }

    public void setF0000049(String f0000049) {
        this.f0000049 = f0000049;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemFullName() {
        return itemFullName;
    }

    public void setItemFullName(String itemFullName) {
        this.itemFullName = itemFullName;
    }

    public String getBaseStandardNumber() {
        return baseStandardNumber;
    }

    public void setBaseStandardNumber(String baseStandardNumber) {
        this.baseStandardNumber = baseStandardNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getDiameterSpecifications() {
        return diameterSpecifications;
    }

    public void setDiameterSpecifications(String diameterSpecifications) {
        this.diameterSpecifications = diameterSpecifications;
    }

    public String getWallThicknessSpecifications() {
        return wallThicknessSpecifications;
    }

    public void setWallThicknessSpecifications(String wallThicknessSpecifications) {
        this.wallThicknessSpecifications = wallThicknessSpecifications;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getF0000045() {
        return f0000045;
    }

    public void setF0000045(String f0000045) {
        this.f0000045 = f0000045;
    }

    public Double getTheoreticalWeight() {
        return theoreticalWeight;
    }

    public void setTheoreticalWeight(Double theoreticalWeight) {
        this.theoreticalWeight = theoreticalWeight;
    }

    public String getF0000020() {
        return f0000020;
    }

    public void setF0000020(String f0000020) {
        this.f0000020 = f0000020;
    }

    public String getF0000023() {
        return f0000023;
    }

    public void setF0000023(String f0000023) {
        this.f0000023 = f0000023;
    }

    public String getF0000118() {
        return f0000118;
    }

    public void setF0000118(String f0000118) {
        this.f0000118 = f0000118;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getInboundLength() {
        return inboundLength;
    }

    public void setInboundLength(Integer inboundLength) {
        this.inboundLength = inboundLength;
    }

    public Integer getProcessLength() {
        return processLength;
    }

    public void setProcessLength(Integer processLength) {
        this.processLength = processLength;
    }

    public Integer getQuantityConsumed() {
        return quantityConsumed;
    }

    public void setQuantityConsumed(Integer quantityConsumed) {
        this.quantityConsumed = quantityConsumed;
    }

    public Integer getInventoryLength() {
        return inventoryLength;
    }

    public void setInventoryLength(Integer inventoryLength) {
        this.inventoryLength = inventoryLength;
    }

    public Integer getInventoryWeight() {
        return inventoryWeight;
    }

    public void setInventoryWeight(Integer inventoryWeight) {
        this.inventoryWeight = inventoryWeight;
    }

    public Integer getWarrantyNumberLength() {
        return warrantyNumberLength;
    }

    public void setWarrantyNumberLength(Integer warrantyNumberLength) {
        this.warrantyNumberLength = warrantyNumberLength;
    }
}
