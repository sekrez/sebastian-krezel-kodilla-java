package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(00001,"Krasnal",'M',1982,2,4,5));
        forumUsersList.add(new ForumUser(00002,"Namolny",'M',1980,4,12,2));
        forumUsersList.add(new ForumUser(00003,"Olka",'F',1995,5,1,7));
        forumUsersList.add(new ForumUser(00004,"KKK",'M',2000,6,30,3));
        forumUsersList.add(new ForumUser(00005,"Zuzanna",'F',1979,11,21,12));
        forumUsersList.add(new ForumUser(00005,"Stefa",'F',1984,5,3,4));
        forumUsersList.add(new ForumUser(00005,"Oleksy",'M',1975,10,5,1));
        forumUsersList.add(new ForumUser(00005,"Kaszanka",'F',1979,9,2,5));
        forumUsersList.add(new ForumUser(00005,"ZZZ_002",'M',1985,8,31,0));

    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsersList);
    }
}