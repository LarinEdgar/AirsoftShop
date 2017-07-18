package com.dao;

import com.entity.Comments;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Shleck on 7/17/2017.
 */
public interface CommetsDAO {

    public void addComment(Comments comments) throws SQLException;

    public void updateComment(Comments comments) throws SQLException;

    public void deleteComment(Comments comments) throws SQLException;

    public List<Comments> getCommentsByUserID(long idUser) throws SQLException;
}
