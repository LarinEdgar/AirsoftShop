package com.entity;

import javax.persistence.*;

/**
 * Created by Shleck on 7/18/2017.
 */
@Entity
@Table(name = "dbcategory", schema = "", catalog = "airsoft_db")
public class Category {
    private int categoryId;
    private String categoryName;

    @Id
    @Column(name = "CATEGORY_ID")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "CATEGORY_NAME")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryId != category.categoryId) return false;
        return !(categoryName != null ? !categoryName.equals(category.categoryName) : category.categoryName != null);

    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        return result;
    }
}
