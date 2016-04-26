/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica3.test;

import com.practica3.principal.Principal;
import javax.swing.JTextArea;

/**
 *
 * @author eddy_
 */
public class Test extends Principal {
    
    JTextArea ta;

    public Test(JTextArea jta) {
        ta = jta;
        System.out.println("ssss");
    }
    

//    public void maind(String[] args) {
//        /*
//        Fibonacci f = new Fibonacci();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("F[" + i + "]: " + f.getNext());
//        }
//         */
// /*
//        PrimeNumber p = new PrimeNumber();
//        
//        for (int i = 0; i < 10; i++) {
//            System.out.println("P: " + p.getNext());
//        }
//         */
// /*
//        PairNumber p = new PairNumber();
//        
//        for (int i = 0; i < 10; i++) {
//            System.out.println("P: " + p.getNumber());
//        }
//         */
// /*
//        RandomNumber r = new RandomNumber();
//        
//        for (int i = 0; i < 10; i++) {
//            System.out.println("R: " + r.getNumber());
//        }
//         */
//
//        Hilo_Secuencia1 h1 = new Hilo_Secuencia1();
//
//        h1.start();
//
//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                h1.change();
//            }
//        };
//        // Aquí se pone en marcha el timer cada segundo. 
//        Timer timer = new Timer();
//        // Dentro de 3000 milisegundos avísame cada 3000 milisegundos 
//        timer.scheduleAtFixedRate(timerTask, 3000, 3000);
//
//        h1.interruption();
//
//    }

    public void append(String string) {
        ta.append(string);
    }
}
