package com.kodilla.testing.collection;

import java.util.ArrayList;

class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> even = new ArrayList<>();
        if (numbers.isEmpty()) {
            System.out.println("ArrayList is empty. Abort checking list.");
        } else {
            for (Integer number : numbers) {
                if(number % 2==0) {
                    even.add(number);
                }
            }
        }
        return even;
    }
}
