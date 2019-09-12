package com.gmall.user.bean;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author aqua
 * @since 2019-09-12
 */
public class PmsProductInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品描述(后台简述）
     */
    private String description;
    /**
     * 三级分类id
     */
    private Long catalog3Id;
    /**
     * 品牌id
     */
    private Long tmId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    @Override
    public String toString() {
        return "PmsProductInfo{" +
        ", id=" + id +
        ", productName=" + productName +
        ", description=" + description +
        ", catalog3Id=" + catalog3Id +
        ", tmId=" + tmId +
        "}";
    }
}
