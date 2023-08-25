package com.ks.ny.entity.vo;

import com.alibaba.excel.annotation.ExcelProperty;

public class WarrantyNumberInventoryVO {

    @ExcelProperty("记录ID(不可修改)")
    private String parentObjectId;
    @ExcelProperty("质保号库存.记录ID(不可修改)")
     private String objectId;
    @ExcelProperty("质保号库存.质保号")
    private String warrantyNumber;

    @ExcelProperty("质保号库存.入库总长度mm")
    private Integer warrantyNumberInboundLength;

    @ExcelProperty("质保号库存.消耗长度mm")
    private Integer warrantyNumberQuantityLength1;

    @ExcelProperty("质保号库存.剩余长度mm")
    private Integer warrantyNumberInventoryLength;
    @ExcelProperty("质保号库存.区域1")
    private String warrantyNumberRegion1;
    @ExcelProperty("质保号库存.区域1剩余长度/mm")
    private Integer warrantyNumberRegion1Length;
    @ExcelProperty("质保号库存.区域2")
    private String warrantyNumberRegion2;
    @ExcelProperty("质保号库存.区域2剩余长度/mm")
    private Integer warrantyNumberRegion2Length;

    @ExcelProperty("质保号库存.区域3")
    private String warrantyNumberRegion3;
    @ExcelProperty("质保号库存.区域3剩余长度/mm")
    private Integer warrantyNumberRegion3Length;

    @ExcelProperty("质保号库存.区域4")
    private String warrantyNumberRegion4;
    @ExcelProperty("质保号库存.区域4剩余长度/mm")
    private Integer warrantyNumberRegion4Length;

    @ExcelProperty("质保号库存.区域5")
    private String warrantyNumberRegion5;
    @ExcelProperty("质保号库存.区域5剩余长度/mm")
    private Integer warrantyNumberRegion5Length;

    public String getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(String parentObjectId) {
        this.parentObjectId = parentObjectId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getWarrantyNumber() {
        return warrantyNumber;
    }

    public void setWarrantyNumber(String warrantyNumber) {
        this.warrantyNumber = warrantyNumber;
    }

    public Integer getWarrantyNumberInboundLength() {
        return warrantyNumberInboundLength;
    }

    public void setWarrantyNumberInboundLength(Integer warrantyNumberInboundLength) {
        this.warrantyNumberInboundLength = warrantyNumberInboundLength;
    }

    public Integer getWarrantyNumberQuantityLength1() {
        return warrantyNumberQuantityLength1;
    }

    public void setWarrantyNumberQuantityLength1(Integer warrantyNumberQuantityLength1) {
        this.warrantyNumberQuantityLength1 = warrantyNumberQuantityLength1;
    }

    public Integer getWarrantyNumberInventoryLength() {
        return warrantyNumberInventoryLength;
    }

    public void setWarrantyNumberInventoryLength(Integer warrantyNumberInventoryLength) {
        this.warrantyNumberInventoryLength = warrantyNumberInventoryLength;
    }

    public String getWarrantyNumberRegion1() {
        return warrantyNumberRegion1;
    }

    public void setWarrantyNumberRegion1(String warrantyNumberRegion1) {
        this.warrantyNumberRegion1 = warrantyNumberRegion1;
    }

    public Integer getWarrantyNumberRegion1Length() {
        return warrantyNumberRegion1Length;
    }

    public void setWarrantyNumberRegion1Length(Integer warrantyNumberRegion1Length) {
        this.warrantyNumberRegion1Length = warrantyNumberRegion1Length;
    }

    public String getWarrantyNumberRegion2() {
        return warrantyNumberRegion2;
    }

    public void setWarrantyNumberRegion2(String warrantyNumberRegion2) {
        this.warrantyNumberRegion2 = warrantyNumberRegion2;
    }

    public Integer getWarrantyNumberRegion2Length() {
        return warrantyNumberRegion2Length;
    }

    public void setWarrantyNumberRegion2Length(Integer warrantyNumberRegion2Length) {
        this.warrantyNumberRegion2Length = warrantyNumberRegion2Length;
    }

    public String getWarrantyNumberRegion3() {
        return warrantyNumberRegion3;
    }

    public void setWarrantyNumberRegion3(String warrantyNumberRegion3) {
        this.warrantyNumberRegion3 = warrantyNumberRegion3;
    }

    public Integer getWarrantyNumberRegion3Length() {
        return warrantyNumberRegion3Length;
    }

    public void setWarrantyNumberRegion3Length(Integer warrantyNumberRegion3Length) {
        this.warrantyNumberRegion3Length = warrantyNumberRegion3Length;
    }

    public String getWarrantyNumberRegion4() {
        return warrantyNumberRegion4;
    }

    public void setWarrantyNumberRegion4(String warrantyNumberRegion4) {
        this.warrantyNumberRegion4 = warrantyNumberRegion4;
    }

    public Integer getWarrantyNumberRegion4Length() {
        return warrantyNumberRegion4Length;
    }

    public void setWarrantyNumberRegion4Length(Integer warrantyNumberRegion4Length) {
        this.warrantyNumberRegion4Length = warrantyNumberRegion4Length;
    }

    public String getWarrantyNumberRegion5() {
        return warrantyNumberRegion5;
    }

    public void setWarrantyNumberRegion5(String warrantyNumberRegion5) {
        this.warrantyNumberRegion5 = warrantyNumberRegion5;
    }

    public Integer getWarrantyNumberRegion5Length() {
        return warrantyNumberRegion5Length;
    }

    public void setWarrantyNumberRegion5Length(Integer warrantyNumberRegion5Length) {
        this.warrantyNumberRegion5Length = warrantyNumberRegion5Length;
    }
}
