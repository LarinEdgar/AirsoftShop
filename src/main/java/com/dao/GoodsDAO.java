package com.dao;

import com.entity.DbgoodsEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Shleck on 6/23/2017.
 */
public interface GoodsDAO {

    public void addGoods(DbgoodsEntity dbgoodsEntity) throws SQLException;

    public void updateGoods(DbgoodsEntity dbgoodsEntity) throws SQLException;

    public DbgoodsEntity getGoodsById(long id) throws SQLException;

    public List getAllGoods() throws SQLException;

    public void deleteGoods(DbgoodsEntity dbgoodsEntity) throws SQLException;


}
