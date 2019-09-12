package com.gmall.user.bean;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * sku销售属性值
 * </p>
 *
 * @author aqua
 * @since 2019-09-12
 */
public class PmsSkuSaleAttrValue implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 库存单元id
     */
    private Long skuId;
    /**
     * 销售属性id（冗余)
     */
    private Long saleAttrId;
    /**
     * 销售属性值id
     */
    private Long saleAttrValueId;
    /**
     * 销售属性名称(冗余)
     */
    private String saleAttrName;
    /**
     * 销售属性值名称(冗余)
     */
    private String saleAttrValueName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Long saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public Long getSaleAttrValueId() {
        return saleAttrValueId;
    }

    public void setSaleAttrValueId(Long saleAttrValueId) {
        this.saleAttrValueId = saleAttrValueId;
    }

    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    @Override
    public String toString() {
        return "PmsSkuSaleAttrValue{" +
        ", id=" + id +
        ", skuId=" + skuId +
        ", saleAttrId=" + saleAttrId +
        ", saleAttrValueId=" + saleAttrValueId +
        ", saleAttrName=" + saleAttrName +
        ", saleAttrValueName=" + saleAttrValueName +
        "}";
    }
}
