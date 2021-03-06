/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica3.hilos;

import com.practica3.algoritmos.Fibonacci;
import com.practica3.algoritmos.PrimeNumber;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author eddy_
 */
public class Hilo_Secuencia1 extends Thread {

    private final Fibonacci fibonacci;
    private final PrimeNumber primes;
    private boolean change;
    private boolean pause;
    JTextArea ta;

    public Hilo_Secuencia1(JTextArea jta) {
        fibonacci = new Fibonacci();
        primes = new PrimeNumber();

        change = true;
        pause = false;
        
        ta = jta;
    }

    @Override
    public void run() {
        ta.append("Imprimiendo: Fibonacci\n");
        while (!this.pause) {
            if (change) {
                ta.append(fibonacci.getNext() + "\n");
            }
            else {
                ta.append(primes.getNext() + "\n");
            }

            try {

                Thread.sleep(300);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(Hilo_Secuencia1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void change() {
        if (!change) {
            ta.append("Imprimiendo: Fibonacci\n");
        }
        else {
            ta.append("Imprimiendo: Números Primos\n");
        }
        this.change = !this.change;
    }

    public void interruption() {
        this.pause = !this.pause;
    }
}
