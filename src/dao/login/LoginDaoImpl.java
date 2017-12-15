/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.login;



import Main.LoginHibernateUtil;
import java.util.List;
import modelo.login.Login;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author fede_
 */
public class LoginDaoImpl implements LoginDao {
  

    private final SessionFactory sessionFactory;

    public LoginDaoImpl() {
        sessionFactory = LoginHibernateUtil.getSessionFactory();
    }

    @Override
    public List<Login> getAll() {
        Session session = sessionFactory.openSession();
       
        return session.createCriteria(Login.class).list();

    }

    @Override
    public Login get(Long id) {
        Session session = sessionFactory.openSession();

        return (Login) session.createCriteria(Login.class).add(Restrictions.eq("id", id)).uniqueResult();
    }

    @Override
    public void save(Login item) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(item);
        session.getTransaction().commit();
    }

    @Override
    public void update(Login item) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(item);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Login item) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(item);
        session.getTransaction().commit();
    }
      @Override
    public Login get(String nombreDeUsuario) {
        Session session = sessionFactory.openSession();

        return (Login) session.createCriteria(Login.class).add(Restrictions.eq("nombreDeUsuario", nombreDeUsuario)).uniqueResult();
    }

}

