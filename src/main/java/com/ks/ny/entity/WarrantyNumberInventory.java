package com.ks.ny.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * 质保号库存(WarrantyNumberInventory)表实体类
 *
 * @author makejava
 * @since 2023-08-25 09:52:37
 */
@TableName("warranty_number_inventory")
public class WarrantyNumberInventory extends Model<WarrantyNumberInventory> {
    //记录ID(不可修改)
    @TableId
    private String objectId;
    //父id
    private String parentObjectId;
    //质保号
    private String warrantyNumber;
    //入库总长度mm
    private Integer warrantyNumberInboundLength;
    //消耗长度mm
    private Integer warrantyNumberQuantityLength;
    //剩余长度mm
    private Integer warrantyNumberInventoryLength;
    //区域1
    private String warrantyNumberRegion1;
    //区域1剩余长度/mm
    private Integer warrantyNumberRegion1Length;
    //区域2
    private String warrantyNumberRegion2;
    //区域2剩余长度/mm
    private Integer warrantyNumberRegion2Length;
    //区域3
    private String warrantyNumberRegion3;
    //区域3剩余长度/mm
    private Integer warrantyNumberRegion3Length;
    //区域4
    private String warrantyNumberRegion4;
    //区域4剩余长度/mm
    private Integer warrantyNumberRegion4Length;
    //区域5
    private String warrantyNumberRegion5;
    //区域5剩余长度/mm
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

    public Integer getWarrantyNumberQuantityLength() {
        return warrantyNumberQuantityLength;
    }

    public void setWarrantyNumberQuantityLength(Integer warrantyNumberQuantityLength) {
        this.warrantyNumberQuantityLength = warrantyNumberQuantityLength;
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

