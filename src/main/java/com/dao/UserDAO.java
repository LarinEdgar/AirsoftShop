package com.dao;

import com.entity.DbuserEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Shleck on 7/4/2017.
 */
public interface UserDAO {

    public void addUser(DbuserEntity dbuserEntity) throws SQLException;

    public void updateUser(DbuserEntity dbuserEntity) throws SQLException;

    public DbuserEntity getUserById(long id) throws SQLException;

    public List getAllUser() throws SQLException;

    public void deleteUser(DbuserEntity dbuserEntity) throws SQLException;

    public DbuserEntity getEmail(String email) throws SQLException;

}
