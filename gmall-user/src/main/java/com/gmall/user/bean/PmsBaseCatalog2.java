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
public class PmsBaseCatalog2 implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 二级分类名称
     */
    private String name;
    /**
     * 一级分类编号
     */
    private Integer catalog1Id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    @Override
    public String toString() {
        return "PmsBaseCatalog2{" +
        ", id=" + id +
        ", name=" + name +
        ", catalog1Id=" + catalog1Id +
        "}";
    }
}
