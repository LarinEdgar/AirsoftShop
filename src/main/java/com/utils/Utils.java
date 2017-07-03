package com.utils;
import com.entity.Goods;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Shleck on 6/23/2017.
 */
public class Utils {

    public static void createGoodsTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS dbGoods("
                + "GOODS_ID INT(5) NOT NULL AUTO_INCREMENT, "
                + "GOODS_NAME VARCHAR(20) NOT NULL, "
                + "PRISE LONG NOT NULL, "
                + "PRIMARY KEY (GOODS_ID) "
                + ")";
        try (Connection dbConnection = Dbconnect.getConnection()) {
            Statement statement = dbConnection.createStatement();
            statement.execute(createTableSQL);
            System.out.println("Table \"dbGoods\" is created!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
