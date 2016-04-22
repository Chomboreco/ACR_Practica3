/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica3.hilos;

import com.practica3.algoritmos.Fibonacci;
import com.practica3.algoritmos.PrimeNumber;

/**
 *
 * @author eddy_
 */
public class Hilo_Secuencia1 extends Thread {

    Fibonacci fibonacci;
    PrimeNumber primes;

    public Hilo_Secuencia1() {
        fibonacci = new Fibonacci();
        primes = new PrimeNumber();
    }

    @Override
    public void run() {
        
    }
}
