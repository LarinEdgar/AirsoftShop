package com.dao;

import com.entity.Goods;
import com.entity.GoodsImpl;
import com.utils.Dbconnect;
import com.utils.Utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shleck on 6/23/2017.
 */
public class GoodsDAO implements Service {


    @Override
    public void create(Goods goods) {
        try (Connection dbConnection = Dbconnect.getConnection()) {
            PreparedStatement statement = dbConnection.prepareStatement("INSERT INTO dbGoods" + "(GOOD_ID, GOODS_NAME, PRISE) VALUES(?,?)");
            {
                int i = 1;
                statement.setString(i++, goods.getName());
                statement.setDouble(i, goods.getPrise());
                statement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public Goods get(int id) {
        Goods goods = null;
        try (Connection dbConnection = Dbconnect.getConnection();
             PreparedStatement statement = dbConnection.prepareStatement("SELECT * FROM dbGoods WHERE GOOD_ID =?")) {
            int i = 1;
            statement.setInt(i, id);
            ResultSet resultSet = statement.executeQuery();

            GoodsImpl goods1 = new GoodsImpl();
            goods1.setName(resultSet.getString("GOODS_NAME"));
            goods1.setPrise(resultSet.getLong("PRISE"));

        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return goods;

    }

    @Override
    public List getAll() {
        List<Goods> goodsList = new ArrayList<>();
        try (Connection dbConnection = Dbconnect.getConnection()) {
            PreparedStatement statement = dbConnection.prepareStatement("SELECT * FROM dbGoods");
            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                GoodsImpl goods1 = new GoodsImpl();
                goods1.setName(resultset.getString("GOODS_NAME"));
                goods1.setPrise(resultset.getLong("PRISE"));
                goodsList.add(goods1);
            }

        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return goodsList;


    }
}
