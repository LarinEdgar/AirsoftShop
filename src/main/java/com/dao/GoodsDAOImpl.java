package com.dao;

import com.entity.DbgoodsEntity;
import com.utils.HibernateSessionFactory;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shleck on 6/23/2017.
 */
public class GoodsDAOImpl implements GoodsDAO {

    public void addGoods(DbgoodsEntity goods) throws SQLException {
        Session session = null;
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(goods);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void updateGoods(DbgoodsEntity goods) throws SQLException {
        Session session = null;
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(goods);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public DbgoodsEntity getGoodsById(long id) throws SQLException {
        Session session = null;
        DbgoodsEntity goods = null;
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
            goods = (DbgoodsEntity) session.load(DbgoodsEntity.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return goods;
    }

    public List getAllGoods() throws SQLException {
        Session session = null;
        List goodses = new ArrayList<DbgoodsEntity>();
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
            goodses = session.createCriteria(DbgoodsEntity.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return goodses;
    }

    public void deleteGoods(DbgoodsEntity goods) {
        Session session = null;
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(goods);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
