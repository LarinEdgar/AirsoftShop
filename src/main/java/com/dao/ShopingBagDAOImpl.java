package com.dao;

import com.entity.DbshoppingbagEntity;
import com.utils.HibernateSessionFactory;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shleck on 7/11/2017.
 */
public class ShopingBagDAOImpl implements ShopingBagDAO {

    public void addGoods(DbshoppingbagEntity goods) throws SQLException {
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

    public List getAllGoods() throws SQLException {
        Session session = null;
        List goods = new ArrayList<DbshoppingbagEntity>();
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
            goods = session.createCriteria(DbshoppingbagEntity.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return goods;
    }

    public void deleteGoods(DbshoppingbagEntity goods) throws SQLException {
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

    // TODO finish method for change quantity, at this moment this method only returns the goods on quantity
    public DbshoppingbagEntity changeQuantity(int number) throws SQLException {
        Session session = null;
        DbshoppingbagEntity quantity = null;
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
            quantity = (DbshoppingbagEntity) session.load(DbshoppingbagEntity.class, number);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return quantity;
    }
}
