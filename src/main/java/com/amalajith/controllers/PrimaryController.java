package com.amalajith.controllers;

import java.io.IOException;
import java.sql.*;
import com.amalajith.App;
import com.amalajith.entities.Customer;
import javafx.fxml.FXML;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class PrimaryController {

    public PrimaryController(){
//        System.out.println("loaded main");
//        String databaseDriver = "";
////        String jdbcUrl = "jdbc:derby:C:\\Users\\pmama\\membership-manager-pro-data\\test;create=true";
//        String jdbcUrl = "jdbc:mysql://localhost:3006/mmp_test;";
//
//
//        try {
//            Connection connection = DriverManager.getConnection(jdbcUrl);
//            System.out.println("connection success");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MEMBERSHIP_MANAGER_DB_PERSIST_UNIT");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Customer customer = em.find(Customer.class, 1);
        if (customer == null) {
            customer = new Customer();

            tx.begin();
            em.persist(customer);
            tx.commit();
        } else {
            System.out.println("1 entry already exists");
        }

        System.out.println("success");

        em.close();
        emf.close();

    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
