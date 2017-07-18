package com.dao;

import com.entity.Purchase;

import java.sql.SQLException;

/**
 * Created by Shleck on 7/18/2017.
 */
public interface PurchaseDAO {

    public void addGoods(Purchase goods) throws SQLException;

    public void deleteGoods(Purchase goods) throws SQLException;
}
