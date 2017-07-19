package com.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shleck on 7/18/2017.
 */
@Entity
@Table(name = "dbshopingbag", schema = "", catalog = "airsoft_db")
public class GlobalInvoice {

    private int goodsId;
    private String goodsName;
    private double prise;
    private Set<Purchase> purchase = new HashSet<Purchase>(0);
    private User user;

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
    @JoinTable(name = "idUser")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idPurchase")
    public Set<Purchase> getPurchase() {
        return this.purchase;
    }

    public void setPurchase(Set<Purchase> purchase) {
        this.purchase = purchase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalInvoice that = (GlobalInvoice) o;

        if (goodsId != that.goodsId) return false;
        if (Double.compare(that.prise, prise) != 0) return false;
        return !(goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null);

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
