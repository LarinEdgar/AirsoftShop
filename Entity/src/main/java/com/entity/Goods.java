package com.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shleck on 7/7/2017.
 */
@Entity
@Table(name = "dbgoods", schema = "", catalog = "airsoft_db")
public class Goods {
    private int goodsId;
    private String goodsName;
    private double prise;
    private Purchase purchase;
    private Set<Category> category = new HashSet<Category>(0);

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

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "idGoods")
    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategory")
    public Set<Category> getCategory() {
        return category;
    }

    public void setCategory(Set<Category> category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (goodsId != goods.goodsId) return false;
        if (Double.compare(goods.prise, prise) != 0) return false;
        return !(goodsName != null ? !goodsName.equals(goods.goodsName) : goods.goodsName != null);

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
