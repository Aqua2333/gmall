package com.gmall.user.bean;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * sku平台属性值关联表
 * </p>
 *
 * @author aqua
 * @since 2019-09-12
 */
public class PmsSkuAttrValue implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 属性id（冗余)
     */
    private Long attrId;
    /**
     * 属性值id
     */
    private Long valueId;
    /**
     * skuid
     */
    private Long skuId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Override
    public String toString() {
        return "PmsSkuAttrValue{" +
        ", id=" + id +
        ", attrId=" + attrId +
        ", valueId=" + valueId +
        ", skuId=" + skuId +
        "}";
    }
}
