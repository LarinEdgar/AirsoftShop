package com.entity;

/**
 * Created by Shleck on 6/23/2017.
 */
public class GoodsImpl implements Goods {

    int id;
    String name;
    Long prise;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getPrise() {
        return prise;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrise(Long prise) {
        this.prise = prise;
    }
}