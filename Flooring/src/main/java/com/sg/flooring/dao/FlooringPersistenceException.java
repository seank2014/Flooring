/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooring.dao;

/**
 *
 * @author seanking
 */
public class FlooringPersistenceException extends Exception {

    public FlooringPersistenceException(String message) {
        super(message);
    }

    public FlooringPersistenceException(String message, Throwable cause) {

        super(message, cause);
    }

}
