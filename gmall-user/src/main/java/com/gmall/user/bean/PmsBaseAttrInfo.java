package com.gmall.user.bean;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 属性表
 * </p>
 *
 * @author aqua
 * @since 2019-09-12
 */
public class PmsBaseAttrInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 属性名称
     */
    private String attrName;
    private Long catalog3Id;
    /**
     * 启用：1 停用：0
     */
    private String isEnabled;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public String toString() {
        return "PmsBaseAttrInfo{" +
        ", id=" + id +
        ", attrName=" + attrName +
        ", catalog3Id=" + catalog3Id +
        ", isEnabled=" + isEnabled +
        "}";
    }
}
