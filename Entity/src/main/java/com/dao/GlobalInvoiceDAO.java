package com.dao;

import com.entity.GlobalInvoice;

import java.sql.SQLException;

/**
 * Created by Shleck on 7/18/2017.
 */
public interface GlobalInvoiceDAO {

    public void addGoods(GlobalInvoice goods) throws SQLException;

    public void deleteGoods(GlobalInvoice goods) throws SQLException;
}
