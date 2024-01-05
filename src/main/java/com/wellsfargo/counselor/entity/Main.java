package com.wellsfargo.counselor.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Create a SessionFactory
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // Create a Session
        Session session = factory.openSession();

        // Create an Advisor instance
        Advisor advisor = new Advisor("John", "Doe", "123 Main St", "555-1234", "john.doe@example.com");

        // Perform a transaction to save the Advisor
        Transaction transaction = session.beginTransaction();
        session.persist(advisor);

        transaction.commit();

        // Close the Session
        session.close();

        // Close the SessionFactory
        factory.close();
    }
}