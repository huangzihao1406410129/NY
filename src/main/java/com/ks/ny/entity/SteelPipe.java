package com.ks.ny.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (SteelPipe)表实体类
 *
 * @author makejava
 * @since 2023-06-29 15:46:33
 */
@TableName("steel_pipe")
public class SteelPipe extends Model<SteelPipe> {

    @TableId
    private String objectId;
    //数据标题
    private String name;
    //物料状态
    private String itemStatus;
    //标准件是否
    private String standardYn;
    //质保书已确认
    private String warrantyConfirmed;
    //原材料归属
    private String ascription;
    //标准
    private String standard;
    //材质
    private String itemMaterial;
    //通径
    private String f0000039;
    //壁厚
    private String f0000040;
    //非标_通径
    private String f0000048;
    //非标_壁厚
    private String f0000049;
    //物料代码
    private String itemCode;
    //物料全称
    private String itemFullName;
    //基础标准号
    private String baseStandardNumber;
    //描述
    private String description;
    //材料
    private String material;
    //规格
    private String specification;
    //通径规格
    private String diameterSpecifications;
    //壁厚规格
    private String wallThicknessSpecifications;
    //单位
    private String unit;
    //外径/inch
    private String f0000045;
    //理论重量/kg/m
    private Double theoreticalWeight;
    //外径/mm
    private String f0000020;
    //壁厚/mm
    private String f0000023;
    //金蝶规格型号
    private String f0000118;
    //长/mm
    private Double length;
    //宽/mm
    private Double width;
    //入库总数量/mm
    private Double inboundLength;
    //流程进行中的数量/mm
    private Double processLength;
    //消耗的数量/mm
    private Double quantityConsumed;
    //剩余库存数量/mm
    private Double inventoryLength;
    //理论剩余重量/kg
    private Double inventoryWeight;
    //质保号库存数量mm
    private Double warrantyNumberLength;


    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
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

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getInboundLength() {
        return inboundLength;
    }

    public void setInboundLength(Double inboundLength) {
        this.inboundLength = inboundLength;
    }

    public Double getProcessLength() {
        return processLength;
    }

    public void setProcessLength(Double processLength) {
        this.processLength = processLength;
    }

    public Double getQuantityConsumed() {
        return quantityConsumed;
    }

    public void setQuantityConsumed(Double quantityConsumed) {
        this.quantityConsumed = quantityConsumed;
    }

    public Double getInventoryLength() {
        return inventoryLength;
    }

    public void setInventoryLength(Double inventoryLength) {
        this.inventoryLength = inventoryLength;
    }

    public Double getInventoryWeight() {
        return inventoryWeight;
    }

    public void setInventoryWeight(Double inventoryWeight) {
        this.inventoryWeight = inventoryWeight;
    }

    public Double getWarrantyNumberLength() {
        return warrantyNumberLength;
    }

    public void setWarrantyNumberLength(Double warrantyNumbeLength) {
        this.warrantyNumberLength = warrantyNumbeLength;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.objectId;
    }
    }

