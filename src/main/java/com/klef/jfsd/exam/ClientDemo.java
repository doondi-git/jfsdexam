package com.klef.jfsd.exam;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        // Hibernate session factory setup
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            // Create and persist a Car instance
            Car car = new Car();
            car.setName("Tesla Model S");
            car.setType("Electric");
            car.setMaxSpeed(200);
            car.setColor("Red");
            car.setNumberOfDoors(4);

            // Create and persist a Truck instance
            Truck truck = new Truck();
            truck.setName("Volvo FH16");
            truck.setType("Diesel");
            truck.setMaxSpeed(120);
            truck.setColor("Blue");
            truck.setLoadCapacity(20000);

            // Save entities
            session.save(car);
            session.save(truck);

            transaction.commit();
            System.out.println("Records inserted successfully!");

        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}
