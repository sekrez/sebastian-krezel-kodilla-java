package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class UsersGenerator {

    public ArrayList<String> generateUsers(int quantity) {
        int i = 0;
        ArrayList<String> users = new ArrayList<>();
        while (i < quantity)
        {
            String userName = "Imie Nazwisko_" + i;

            users.add(userName);
            i++;
        }
        return users;
    }

}
