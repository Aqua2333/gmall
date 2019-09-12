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
public class WmsWareSku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * skuid
     */
    private Long skuId;
    /**
     * 仓库id
     */
    private Long warehouseId;
    /**
     * 库存数
     */
    private Integer stock;
    /**
     * 存货名称
     */
    private String stockName;
    private Integer stockLocked;


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

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Integer getStockLocked() {
        return stockLocked;
    }

    public void setStockLocked(Integer stockLocked) {
        this.stockLocked = stockLocked;
    }

    @Override
    public String toString() {
        return "WmsWareSku{" +
        ", id=" + id +
        ", skuId=" + skuId +
        ", warehouseId=" + warehouseId +
        ", stock=" + stock +
        ", stockName=" + stockName +
        ", stockLocked=" + stockLocked +
        "}";
    }
}
