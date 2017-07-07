import com.entity.DbgoodsEntity;
import com.utils.HibernateSessionFactory;
import org.hibernate.Session;

/**
 * Created by Shleck on 6/23/2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Starting process");
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        System.out.println("Begin transactoion");
        session.beginTransaction();

        DbgoodsEntity dbgoodsEntity = new DbgoodsEntity();
        dbgoodsEntity.setGoodsName("M4A1");
        dbgoodsEntity.setPrise(300L);
        dbgoodsEntity.setCategory("Rifle");
        dbgoodsEntity.setGoodsName("Glock19Pro");
        dbgoodsEntity.setPrise(325L);
        dbgoodsEntity.setCategory("Pistol");

        System.out.println("Saving entity");
        session.save(dbgoodsEntity);
        System.out.println("Committing transaction");
        session.getTransaction().commit();
        System.out.println("Commit successful");
        session.close();


    }
}
