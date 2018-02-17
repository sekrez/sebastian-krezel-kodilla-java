package com.kodilla.testing.collection;

import java.util.*;

class MakerSampleList{

    public ArrayList<Integer> generateList() {
        ArrayList<Integer> numbersList = new ArrayList<>();
        Random generator =new Random();
        for (int i = 0; i < 50; i++) {
            numbersList.add(generator.nextInt(50)+1);
        }
        return numbersList;
    }
}
