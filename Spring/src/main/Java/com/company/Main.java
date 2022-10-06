package com.company;

import com.company.entites.Customer;
import com.company.entites.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Customer.class)
//                .addAnnotatedClass(Reader.class)
                .buildSessionFactory();
        // CRUD
        Session session = null;
        session = factory.getCurrentSession();
        session.beginTransaction();
        Product p = session.get(Product.class, 1);
        System.out.println(p);

        session.getTransaction().commit();

    }
}
