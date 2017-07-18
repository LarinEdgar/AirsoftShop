package com.entity;

import javax.persistence.*;

/**
 * Created by Shleck on 7/18/2017.
 */
@Entity
@Table(name = "dbpurchase", schema = "", catalog = "airsoft_db")
public class Purchase {

    private int goodsId;
    private String goodsName;
    private double prise;

    @Id
    @Column(name = "GOODS_ID")
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "GOODS_NAME")
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "PRISE")
    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchase purchase = (Purchase) o;

        if (goodsId != purchase.goodsId) return false;
        if (Double.compare(purchase.prise, prise) != 0) return false;
        return !(goodsName != null ? !goodsName.equals(purchase.goodsName) : purchase.goodsName != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = goodsId;
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        temp = Double.doubleToLongBits(prise);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
