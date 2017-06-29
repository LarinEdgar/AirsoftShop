package com.dao;

import com.entity.Goods;

import java.util.List;

/**
 * Created by Shleck on 6/23/2017.
 */
public interface Service {

    void create(Goods goods);

    void update();

    void delete();

    Goods get(int id);

    List getAll();
}
