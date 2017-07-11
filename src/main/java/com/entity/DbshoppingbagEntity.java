package com.entity;

import javax.persistence.*;

/**
 * Created by Shleck on 7/11/2017.
 */
@Entity
@Table(name = "dbgoods", schema = "", catalog = "airsoft_db")
public class DbshoppingbagEntity {
    private int id;
    private String name;
    private double prise;
    private String category;
    private int quantity;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "PRISE")
    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    @Basic
    @Column(name = "CATEGORY")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "QUALITY")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbshoppingbagEntity that = (DbshoppingbagEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.prise, prise) != 0) return false;
        if (quantity != that.quantity) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return !(category != null ? !category.equals(that.category) : that.category != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(prise);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + quantity;
        return result;
    }
}
