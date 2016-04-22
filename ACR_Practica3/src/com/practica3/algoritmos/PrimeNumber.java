/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica3.algoritmos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eddy_
 */
public class PrimeNumber {

    private List<Integer> primeNumber;
    private int counter;

    public PrimeNumber() {
        primeNumber = new ArrayList<>();
        counter = 1;
    }

    public boolean isPrime(int numero) {
        int aux;
        
        if (numero < 2) {
            return false;
        }
        else if (numero == 2) {
            return true;
        }
        for (int cont = 2; cont < numero; cont++) {
            aux = numero % cont;
            if (aux == 0) {
                return false;
            }
        }

        return true;
    }

    public int getNext() {
        while (!this.isPrime(counter)) {
            counter++;
        }

        primeNumber.add(counter);
        
        int aux = counter;
        counter++;

        return aux;
    }
}
