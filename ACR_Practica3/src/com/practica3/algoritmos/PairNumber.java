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
public class PairNumber {

    private List<Integer> pairNumber;

    public PairNumber() {
        pairNumber = new ArrayList<>();
        pairNumber.add(0);
    }

    public int getNumber() {
        int number = pairNumber.get(pairNumber.size() - 1) + 2;
        pairNumber.add(number);

        return number;
    }
}
