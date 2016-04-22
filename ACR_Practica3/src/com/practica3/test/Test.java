/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica3.test;

import com.practica3.algoritmos.Fibonacci;
import com.practica3.algoritmos.PairNumber;
import com.practica3.algoritmos.PrimeNumber;
import com.practica3.algoritmos.RandomNumber;

/**
 *
 * @author eddy_
 */
public class Test {

    public static void main(String[] args) {
        /*
        Fibonacci f = new Fibonacci();

        for (int i = 0; i < 10; i++) {
            System.out.println("F[" + i + "]: " + f.getNext());
        }
         */
        
        /*
        PrimeNumber p = new PrimeNumber();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("P: " + p.getNext());
        }
        */
        
        /*
        PairNumber p = new PairNumber();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("P: " + p.getNumber());
        }
        */
        
        RandomNumber r = new RandomNumber();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("R: " + r.getNumber());
        }
    }
}
