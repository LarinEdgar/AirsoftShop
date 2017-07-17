package com.dao;

import com.entity.DbcommentsEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Shleck on 7/17/2017.
 */
public interface CommetsDAO {

    public void addComment(DbcommentsEntity comments) throws SQLException;

    public void updateComment(DbcommentsEntity comments) throws SQLException;

    public void deleteComment(DbcommentsEntity comments) throws SQLException;

    public List<DbcommentsEntity> getCommentsByUserID(long idUser) throws SQLException;
}
