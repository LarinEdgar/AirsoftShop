import com.dao.GoodsDAOImpl;
import com.entity.DbgoodsEntity;
import com.utils.HibernateSessionFactory;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by Shleck on 6/23/2017.
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        System.out.println("Starting process");
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        System.out.println("Begin transactoion");
        session.beginTransaction();

        DbgoodsEntity dbgoodsEntity = new DbgoodsEntity();
        dbgoodsEntity.setGoodsName("0.23g");
        dbgoodsEntity.setPrise(7);
        dbgoodsEntity.setCategory("Airsoft BB");
        dbgoodsEntity.setGoodsName("M4A1");
        dbgoodsEntity.setPrise(300.75);
        dbgoodsEntity.setCategory("Rifle");
        dbgoodsEntity.setGoodsName("Glock19Pro");
        dbgoodsEntity.setPrise(325.25);
        dbgoodsEntity.setCategory("Pistol");
        dbgoodsEntity.setGoodsName("F1");
        dbgoodsEntity.setPrise(25.5);
        dbgoodsEntity.setCategory("Grenade");

        GoodsDAOImpl goodsDAOImpl = new GoodsDAOImpl();
        goodsDAOImpl.getCategory("Grenade");

        System.out.println("Saving entity");
        session.save(dbgoodsEntity);
        System.out.println("Committing transaction");
        session.getTransaction().commit();
        System.out.println("Commit successful");
        session.close();


    }
}
