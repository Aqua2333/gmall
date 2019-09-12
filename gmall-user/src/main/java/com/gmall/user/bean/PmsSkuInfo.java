package com.gmall.user.bean;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 库存单元表
 * </p>
 *
 * @author aqua
 * @since 2019-09-12
 */
public class PmsSkuInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 库存id(itemID)
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品id
     */
    private Long productId;
    /**
     * 价格
     */
    private Double price;
    /**
     * sku名称
     */
    private String skuName;
    /**
     * 商品规格描述
     */
    private String skuDesc;
    private Double weight;
    /**
     * 品牌(冗余)
     */
    private Long tmId;
    /**
     * 三级分类id（冗余)
     */
    private Long catalog3Id;
    /**
     * 默认显示图片(冗余)
     */
    private String skuDefaultImg;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    @Override
    public String toString() {
        return "PmsSkuInfo{" +
        ", id=" + id +
        ", productId=" + productId +
        ", price=" + price +
        ", skuName=" + skuName +
        ", skuDesc=" + skuDesc +
        ", weight=" + weight +
        ", tmId=" + tmId +
        ", catalog3Id=" + catalog3Id +
        ", skuDefaultImg=" + skuDefaultImg +
        "}";
    }
}
