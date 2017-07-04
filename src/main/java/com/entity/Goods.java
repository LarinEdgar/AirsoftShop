package com.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "Goods")
public class Goods {

    private Long id;
    private String name;
    private Long prise;

    public Goods(){
        name = null;
    }

    public Goods(Goods goods){
        name = goods.getName();
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    public Long getId;

    @Column(name = "name")
    public String getName(){
        return name;
    }

    @Column(name = "prise")
    public Long getPrise(){
        return prise;
    }

    public void setId(Long i){
        id = i;
    }

    public void setName(String s){
        name = s;
    }

    public void setPrise(Long l){
        prise = l;
    }
}
