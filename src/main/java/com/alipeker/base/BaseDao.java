package com.alipeker.base;

import com.alipeker.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao {

    private SessionFactory sessionFactory;

    public BaseDao() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    protected Session getCurrentSession(){

        Session session = sessionFactory.openSession();

        return session;
    }
}
