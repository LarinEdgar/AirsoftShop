import com.entity.Goods;
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

        Goods goods = new Goods();
        goods.setGoodsName("0.23g");
        goods.setPrise(7);
        goods.setCategory("Airsoft BB");
        goods.setGoodsName("M4A1");
        goods.setPrise(300.75);
        goods.setCategory("Rifle");
        goods.setGoodsName("Glock19Pro");
        goods.setPrise(325.25);
        goods.setCategory("Pistol");
        goods.setGoodsName("F1");
        goods.setPrise(25.5);
        goods.setCategory("Grenade");

        System.out.println("Saving entity");
        session.save(goods);
        System.out.println("Committing transaction");
        session.getTransaction().commit();
        System.out.println("Commit successful");
        session.close();
    }
}
