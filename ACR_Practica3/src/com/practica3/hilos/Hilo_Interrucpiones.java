/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica3.hilos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author eddy_
 */
public class Hilo_Interrucpiones extends Thread {

    Hilo_Secuencia1 h1;
    Hilo_Secuencia2 h2;
    int interruptions_thread1;
    int interruptions_thread2;

    JTextArea ta;
    FileWriter log;

    boolean pause;

    public Hilo_Interrucpiones(Hilo_Secuencia1 thread1, Hilo_Secuencia2 thread2, JTextArea jta, FileWriter fw) {
        h1 = thread1;
        h2 = thread2;

        ta = jta;
        log = fw;

        interruptions_thread1 = 1;
        interruptions_thread2 = 1;
    }

    public int getInteruptionsT1() {
        return interruptions_thread1;
    }

    public int getInteruptionsT2() {
        return interruptions_thread2;
    }

    @Override
    public void run() {
        // Aquí se pone en marcha el timer.
        Timer timerH1 = new Timer();
        Timer timerH2 = new Timer();

        TimerTask taskThread1 = new TimerTask() {
            @Override
            public void run() {
                ta.append("Interrumpiendo: Hilo 1 - [" + interruptions_thread1 + "]\n");
                try {
                    log.write("[" + new Date() + "] [info] [Thread 1] " + "Interrumpiendo: Hilo 1 - " + "[Interrupciones]:" + interruptions_thread1 + "\n");
                }
                catch (IOException ex) {
                    Logger.getLogger(Hilo_Interrucpiones.class.getName()).log(Level.SEVERE, null, ex);
                }

                h1.change();
                interruptions_thread1++;

                if (interruptions_thread1 > 10) {
                    ta.append("== Hilo 1 ha terminado de imprimir ==\n");
                    try {
                        log.write("[" + new Date() + "] [info] [Thread 1] " + "== Hilo 1 ha terminado de imprimir ==\n");
                    }
                    catch (IOException ex) {
                        Logger.getLogger(Hilo_Interrucpiones.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    h1.interruption();
                    timerH1.cancel();
                }
            }
        };

        TimerTask taskThread2 = new TimerTask() {
            @Override
            public void run() {
                ta.append("Interrumpiendo: Hilo 2 - [" + interruptions_thread2 + "]\n");
                try {
                    log.write("[" + new Date() + "] [info] [Thread 2] " + "Interrumpiendo: Hilo 2 - " + "[Interrupciones]:" + interruptions_thread2 + "\n");
                }
                catch (IOException ex) {
                    Logger.getLogger(Hilo_Interrucpiones.class.getName()).log(Level.SEVERE, null, ex);
                }

                h2.change();
                interruptions_thread2++;

                if (interruptions_thread2 > 10) {
                    ta.append("== Hilo 2 ha terminado de imprimir ==\n");
                    try {
                        log.write("[" + new Date() + "] [info] [Thread 2] " + "== Hilo 2 ha terminado de imprimir ==\n");
                    }
                    catch (IOException ex) {
                        Logger.getLogger(Hilo_Interrucpiones.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    h2.interruption();
                    timerH2.cancel();

                    try {
                        log.close();
                    }
                    catch (IOException ex) {
                        Logger.getLogger(Hilo_Interrucpiones.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        // Dentro de 3000 milisegundos avísame cada 3000 milisegundos 
        timerH1.scheduleAtFixedRate(taskThread1, 2000, 2000);
        timerH2.scheduleAtFixedRate(taskThread2, 3000, 3000);
    }
}
