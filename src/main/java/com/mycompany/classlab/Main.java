/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classlab;

/**
 *
 * @author behlt
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new ExceptionC("ExceptionC");
        } catch (ExceptionA e) {
            System.out.println("Caught ExceptionA: " + e.getMessage());
        }
        
        try {
            throw new ExceptionB("ExceptionB");
        } catch (ExceptionA e) {
            System.out.println("Caught ExceptionA: " + e.getMessage());
        }
    }
}