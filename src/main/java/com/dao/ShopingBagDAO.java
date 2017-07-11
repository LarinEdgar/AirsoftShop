package com.dao;

import com.entity.DbshoppingbagEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Shleck on 7/11/2017.
 */
public interface ShopingBagDAO {

    public void addGoods(DbshoppingbagEntity dbgoodsEntity) throws SQLException;

    public List getAllGoods() throws SQLException;

    public void deleteGoods(DbshoppingbagEntity dbgoodsEntity) throws SQLException;

    public DbshoppingbagEntity changeQuantity(int quantity) throws SQLException;
}
