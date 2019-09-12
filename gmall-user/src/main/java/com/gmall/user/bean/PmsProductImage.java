package com.gmall.user.bean;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 商品图片表
 * </p>
 *
 * @author aqua
 * @since 2019-09-12
 */
public class PmsProductImage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品id
     */
    private Long productId;
    /**
     * 图片名称
     */
    private String imgName;
    /**
     * 图片路径
     */
    private String imgUrl;


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

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "PmsProductImage{" +
        ", id=" + id +
        ", productId=" + productId +
        ", imgName=" + imgName +
        ", imgUrl=" + imgUrl +
        "}";
    }
}
