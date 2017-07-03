package com.entity;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

/**
 * Created by Shleck on 6/23/2017.
 */
@Entity
public interface Goods {

    int getId();
    String getName();
    Long getPrise();

}
