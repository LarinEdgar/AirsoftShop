package com.dao;

import com.entity.Category;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Shleck on 7/18/2017.
 */
public interface CategoryDAO {

    public void addCategory(Category category) throws SQLException;

    public void updateCategory(Category category) throws SQLException;

    public Category getCategoryById(long id) throws SQLException;

    public List getAllCategory() throws SQLException;

    public void deleteCategory(Category category) throws SQLException;
}
