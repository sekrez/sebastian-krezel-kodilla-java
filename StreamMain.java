package com.kodilla.stream;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> resultForumMap = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> LocalDate.now().compareTo(user.getBirthDate()) > 20)
                .filter(user -> user.getPublishedPostQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueUserIdentifier, user -> user));
        System.out.print("Forum users quantity:" + resultForumMap.size() + "\n");
        resultForumMap.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
    }
}