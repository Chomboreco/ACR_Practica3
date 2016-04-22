/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica3.algoritmos;

import java.util.ArrayList;

/**
 *
 * @author eddy_
 */
public class Fibonacci {

    ArrayList<Integer> succession;
    boolean state;
    int lastTwo[];

    public Fibonacci() {
        succession = new ArrayList<>();
        state = false;
        lastTwo = new int[2];

        succession.add(0);
        succession.add(1);

        lastTwo[0] = 0;
        lastTwo[1] = 1;
    }

    public int getCalculation() {
        int aux = lastTwo[0];
        lastTwo[0] = lastTwo[1];
        lastTwo[1] = aux + lastTwo[1];

        succession.add(lastTwo[1]);

        return lastTwo[1];
    }
}
