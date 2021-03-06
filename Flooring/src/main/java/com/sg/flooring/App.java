/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooring;

import com.sg.flooring.controller.FlooringController;
import com.sg.flooring.dao.FlooringPersistenceException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author seanking
 */
public class App {

    public static final String configure = "configure.txt";

    /**
     * @param args the command line arguments
     * @throws com.sg.flooring.dao.FlooringPersistenceException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FlooringPersistenceException, FileNotFoundException {

//       UserIO myIo = new UserIOConsole();
//       View myView = new View(myIo);
//       OrderDAO pdao = new OrderDAOProdFileImpl();
//       OrderDAO tdao = new OrderDaoTrainingFileImpl();
//       ProductDAO prod = new ProductDAOFileImpl();
//       TaxDAO tax = new TaxDAOFileImpl();
//       FlooringAuditDao myAuditDao = new FlooringAuditFileImpl();
//       ServiceLayer myService = new ServiceLayerImpl(myAuditDao,pdao, prod, tax);
//       FlooringController controller = new FlooringController(myService, myView);
//       controller.run();
//       
        Scanner scanner;

        scanner = new Scanner(
                new BufferedReader(
                        new FileReader(configure)));
        String currentLine;

        scanner.hasNextLine();

        currentLine = scanner.nextLine();

        scanner.close();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        if (currentLine.equalsIgnoreCase("training")) {
            FlooringController controller = ctx.getBean("trainingController", FlooringController.class);
            controller.run();
        }

        if (currentLine.equalsIgnoreCase("product")) {
            FlooringController controller = ctx.getBean("controller", FlooringController.class);
            controller.run();
        }

    }

}
