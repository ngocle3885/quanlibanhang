package com.nhom28.quanlibanhang.hibernate;

import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate examle + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        

        session.getTransaction().commit();
        
        
    }
}
