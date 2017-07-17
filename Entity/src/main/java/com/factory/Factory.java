package com.factory;

import com.dao.*;
import com.implementations.CommentsDAOImpl;
import com.implementations.GoodsDAOImpl;
import com.implementations.UserDAOImpl;

/**
 * Created by Shleck on 7/4/2017.
 */
public class Factory {

    private static GoodsDAO goodsDAO = null;
    private static UserDAO userDAO = null;
    private static CommetsDAO commetsDAO = null;
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
}
