package com.factory;

import com.dao.*;
import com.entity.Category;
import com.entity.GlobalInvoice;
import com.entity.Purchase;
import com.implementations.*;

/**
 * Created by Shleck on 7/4/2017.
 */
public class Factory {

    private static GoodsDAO goodsDAO = null;
    private static UserDAO userDAO = null;
    private static CommetsDAO commetsDAO = null;
    private static CategoryDAO categoryDAO = null;
    private GlobalInvoiceDAO globalInvoiceDAO = null;
    private PurchaseDAO purchaseDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public GoodsDAO getGoodsDAO() {
        if (goodsDAO == null) {
            goodsDAO = new GoodsDAOImpl();
        }
        return goodsDAO;
    }

    public UserDAO getUserDAO() {
        if (userDAO == null) {
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }

    public CommetsDAO getCommetsDAO() {
        if (commetsDAO == null) {
            commetsDAO = new CommentsDAOImpl();
        }
        return commetsDAO;
    }

    public CategoryDAO getCategoryDAO() {
        if (categoryDAO == null) {
            categoryDAO = new CategoryDAOImpl();
        }
        return categoryDAO;
    }

    public GlobalInvoiceDAO getGlobalInvoiceDAO() {
        if (globalInvoiceDAO == null) {
            globalInvoiceDAO = new GlobalInvoiceDAOImpl();
        }
        return globalInvoiceDAO;
    }

    public PurchaseDAO getPurchaseDAO() {
        if (purchaseDAO == null) {
            purchaseDAO = new PurchaseDAOImpl();
        }
        return purchaseDAO;
    }

}
