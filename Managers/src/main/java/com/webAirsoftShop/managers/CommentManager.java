package com.webAirsoftShop.managers;

import com.entity.DbcommentsEntity;
import com.entity.DbuserEntity;
import com.factory.Factory;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Shleck on 7/13/2017.
 */
public class CommentManager {
    private static CommentManager instanse = null;

    public static CommentManager getCommentManager() {
        if (instanse == null) {
            instanse = new CommentManager();
        }
        return instanse;
    }

    public void addComment(Map<String, String[]> mapParam) throws Exception {

        int id = Integer.parseInt(mapParam.get("index")[0]);
        DbuserEntity currentUser = null;
        try {
            currentUser = Factory.getInstance().getUserDAO().getUserById(id);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Can't Find user!");
            throw new Exception();
        }
        String commentText = mapParam.get("commentText")[0];
        String dateStr = mapParam.get("date")[0];
        DbcommentsEntity comments = new DbcommentsEntity();

        Date date = Date.valueOf(dateStr);
        comments.setCommentText(commentText);
        comments.setDateComment(date);
    }

    private void addInputComment(DbcommentsEntity comments, DbuserEntity currentUser) throws Exception {
        comments.setUser(currentUser);
        try {
            System.out.println("get factory");
            Factory.getInstance().getCommetsDAO().addComment(comments);
        } catch (SQLException e) {
            System.out.println("Enable to add bill");
            e.printStackTrace();
            throw new Exception();
        }
    }
}
