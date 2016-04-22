/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica3.algoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author eddy_
 */
public class RandomNumber {

    private List<Integer> randomNumber;

    public RandomNumber() {
        randomNumber = new ArrayList<>();
    }

    public int getNumber() {
        Random random = new Random();
        int number = random.nextInt((200 - 1) + 1) + 1;

        randomNumber.add(number);

        return number;
    }
}
