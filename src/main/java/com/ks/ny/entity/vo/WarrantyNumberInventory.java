package com.ks.ny.entity.vo;

import com.alibaba.excel.annotation.ExcelProperty;

public class WarrantyNumberInventory extends SteelPipeExcelVO {
    @ExcelProperty("质保号库存.记录ID(不可修改)")
     private String objectId;
    @ExcelProperty("质保号库存.质保号")
    private String warrantyNumber;

    @ExcelProperty("质保号库存.入库总长度mm")
    private Integer warrantyNumber_inboundLength;

    @ExcelProperty("质保号库存.消耗长度mm")
    private Integer warrantyNumber_quantityLength;

    @ExcelProperty("质保号库存.剩余长度mm")
    private Integer warrantyNumber_inventoryLength;
    @ExcelProperty("质保号库存.区域1")
    private String warrantyNumber_region1;
    @ExcelProperty("质保号库存.区域1剩余长度/mm")
    private Integer warrantyNumber_region1_length;
    @ExcelProperty("质保号库存.区域2")
    private String warrantyNumber_region2;
    @ExcelProperty("质保号库存.区域2剩余长度/mm")
    private Integer warrantyNumber_region2_length;

    @ExcelProperty("质保号库存.区域3")
    private String warrantyNumber_region3;
    @ExcelProperty("质保号库存.区域3剩余长度/mm")
    private Integer warrantyNumber_region3_length;

    @ExcelProperty("质保号库存.区域4")
    private String warrantyNumber_region4;
    @ExcelProperty("质保号库存.区域4剩余长度/mm")
    private Integer warrantyNumber_region4_length;

    @ExcelProperty("质保号库存.区域5")
    private String warrantyNumber_region5;
    @ExcelProperty("质保号库存.区域5剩余长度/mm")
    private Integer warrantyNumber_region5_length;

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

    public Integer getWarrantyNumber_inboundLength() {
        return warrantyNumber_inboundLength;
    }

    public void setWarrantyNumber_inboundLength(Integer warrantyNumber_inboundLength) {
        this.warrantyNumber_inboundLength = warrantyNumber_inboundLength;
    }

    public Integer getWarrantyNumber_quantityLength() {
        return warrantyNumber_quantityLength;
    }

    public void setWarrantyNumber_quantityLength(Integer warrantyNumber_quantityLength) {
        this.warrantyNumber_quantityLength = warrantyNumber_quantityLength;
    }

    public Integer getWarrantyNumber_inventoryLength() {
        return warrantyNumber_inventoryLength;
    }

    public void setWarrantyNumber_inventoryLength(Integer warrantyNumber_inventoryLength) {
        this.warrantyNumber_inventoryLength = warrantyNumber_inventoryLength;
    }

    public String getWarrantyNumber_region1() {
        return warrantyNumber_region1;
    }

    public void setWarrantyNumber_region1(String warrantyNumber_region1) {
        this.warrantyNumber_region1 = warrantyNumber_region1;
    }

    public Integer getWarrantyNumber_region1_length() {
        return warrantyNumber_region1_length;
    }

    public void setWarrantyNumber_region1_length(Integer warrantyNumber_region1_length) {
        this.warrantyNumber_region1_length = warrantyNumber_region1_length;
    }

    public String getWarrantyNumber_region2() {
        return warrantyNumber_region2;
    }

    public void setWarrantyNumber_region2(String warrantyNumber_region2) {
        this.warrantyNumber_region2 = warrantyNumber_region2;
    }

    public Integer getWarrantyNumber_region2_length() {
        return warrantyNumber_region2_length;
    }

    public void setWarrantyNumber_region2_length(Integer warrantyNumber_region2_length) {
        this.warrantyNumber_region2_length = warrantyNumber_region2_length;
    }

    public String getWarrantyNumber_region3() {
        return warrantyNumber_region3;
    }

    public void setWarrantyNumber_region3(String warrantyNumber_region3) {
        this.warrantyNumber_region3 = warrantyNumber_region3;
    }

    public Integer getWarrantyNumber_region3_length() {
        return warrantyNumber_region3_length;
    }

    public void setWarrantyNumber_region3_length(Integer warrantyNumber_region3_length) {
        this.warrantyNumber_region3_length = warrantyNumber_region3_length;
    }

    public String getWarrantyNumber_region4() {
        return warrantyNumber_region4;
    }

    public void setWarrantyNumber_region4(String warrantyNumber_region4) {
        this.warrantyNumber_region4 = warrantyNumber_region4;
    }

    public Integer getWarrantyNumber_region4_length() {
        return warrantyNumber_region4_length;
    }

    public void setWarrantyNumber_region4_length(Integer warrantyNumber_region4_length) {
        this.warrantyNumber_region4_length = warrantyNumber_region4_length;
    }

    public String getWarrantyNumber_region5() {
        return warrantyNumber_region5;
    }

    public void setWarrantyNumber_region5(String warrantyNumber_region5) {
        this.warrantyNumber_region5 = warrantyNumber_region5;
    }

    public Integer getWarrantyNumber_region5_length() {
        return warrantyNumber_region5_length;
    }

    public void setWarrantyNumber_region5_length(Integer warrantyNumber_region5_length) {
        this.warrantyNumber_region5_length = warrantyNumber_region5_length;
    }
}
