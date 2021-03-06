package com.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Shleck on 7/17/2017.
 */
@Entity
@Table(name = "dbcomments", schema = "", catalog = "airsoft_db")
public class Comments {

    private int idComment;
    private Date dateComment;
    private String commentText;
    private User user;
    private Goods goods;

    @Id
    @Column(name = "COMMENT_ID")
    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    @Column(name = "COMMENT_DATE")
    public Date getDateComment() {
        return dateComment;
    }

    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }

    @Column(name = "COMMENT_TEXT")
    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idUser")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idGoods")
    public Goods getGoods(){
        return goods;
    }

    public void setGoods(Goods goods){
        this.goods = goods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comments that = (Comments) o;

        if (idComment != that.idComment) return false;
        if (dateComment != null ? !dateComment.equals(that.dateComment) : that.dateComment != null) return false;
        if (commentText != null ? !commentText.equals(that.commentText) : that.commentText != null) return false;
        return !(user != null ? !user.equals(that.user) : that.user != null);

    }

    @Override
    public int hashCode() {
        int result = idComment;
        result = 31 * result + (dateComment != null ? dateComment.hashCode() : 0);
        result = 31 * result + (commentText != null ? commentText.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
