package com.dao;

import com.entity.Goods;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Shleck on 6/23/2017.
 */
public interface GoodsDAO {

    public void addGoods(Goods goods) throws SQLException;

    public void updateGoods(Goods goods) throws SQLException;

    public Goods getGoodsById(long id) throws SQLException;

    public List getAllGoods() throws SQLException;

    public void deleteGoods(Goods goods);


}
