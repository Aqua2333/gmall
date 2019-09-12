package com.gmall.user.bean;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 属性值表
 * </p>
 *
 * @author aqua
 * @since 2019-09-12
 */
public class PmsBaseAttrValue implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 属性值名称
     */
    private String valueName;
    /**
     * 属性id
     */
    private Long attrId;
    /**
     * 启用：1 停用：0 1
     */
    private String isEnabled;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public String toString() {
        return "PmsBaseAttrValue{" +
        ", id=" + id +
        ", valueName=" + valueName +
        ", attrId=" + attrId +
        ", isEnabled=" + isEnabled +
        "}";
    }
}
