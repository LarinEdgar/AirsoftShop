package com.factory;

import com.dao.GoodsDAO;
import com.dao.GoodsDAOImpl;
import com.dao.UserDAO;
import com.dao.UserDAOImpl;

/**
 * Created by Shleck on 7/4/2017.
 */
public class Factory {

    private static GoodsDAO goodsDAO = null;
    private static Factory instance = null;
    private static UserDAO userDAO = null;

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

    public UserDAO getUserDAO(){
        if (userDAO == null){
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }

}
