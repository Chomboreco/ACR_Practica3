/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica3.hilos;

import com.practica3.algoritmos.PairNumber;
import com.practica3.algoritmos.RandomNumber;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author eddy_
 */
public class Hilo_Secuencia2 extends Thread {

    private final PairNumber pair;
    private final RandomNumber random;
    private boolean change;
    private boolean pause;

    JTextArea ta;

    public Hilo_Secuencia2(JTextArea jta) {
        pair = new PairNumber();
        random = new RandomNumber();

        ta = jta;

        change = true;
        pause = false;
    }

    @Override
    public void run() {
        ta.append("Imprimiendo: Números Pares\n");
        while (!this.pause) {
            if (change) {
                ta.append(pair.getNumber() + "\n");
            }
            else {
                ta.append(random.getNumber() + "\n");
            }

            try {
                Thread.sleep(300);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(Hilo_Secuencia2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void change() {
        if (!change) {
            ta.append("Imprimiendo: Números Pares\n");
        }
        else {
            ta.append("Imprimiendo: Números Aleatorios\n");
        }
        this.change = !this.change;
    }

    public void interruption() {
        this.pause = !this.pause;
    }
}
