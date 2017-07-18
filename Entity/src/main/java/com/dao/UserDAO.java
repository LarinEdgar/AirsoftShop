package com.dao;

import com.entity.User;

import java.sql.SQLException;

/**
 * Created by Shleck on 7/4/2017.
 */
public interface UserDAO {

    public void addUser(User user) throws SQLException;

    public void updateUser(User user) throws SQLException;

    public User getUserByName(String name) throws SQLException;

    public Long getUserIdByName(String name) throws SQLException;

    public User getUserById(long id) throws SQLException;

    public void deleteUser(User user) throws SQLException;

}
