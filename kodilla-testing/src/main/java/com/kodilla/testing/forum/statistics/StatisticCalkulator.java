package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticCalkulator {
    private int usersQuantity;
    private int postQuantity;
    private int commentsQuantity;
    private double averageUserPost = 0;
    private double averageUserComments = 0;
    private double averagePostComments = 0;

    void calculateAdvStatistics(Statistics statistics) {

        if (statistics.usersNames().size() > 0) {
            usersQuantity = statistics.usersNames().size();

        }

        if (statistics.postsCount() > 0) {
            postQuantity = statistics.postsCount();
        }

        if (statistics.commentsCount() > 0) {
            commentsQuantity = statistics.commentsCount();
        }
        if (usersQuantity > 0) {
            averageUserPost = (double)postQuantity / usersQuantity;
            averageUserComments = (double)commentsQuantity / usersQuantity;
        }
        if (postQuantity > 0) { averagePostComments = (double)commentsQuantity / postQuantity;}
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAverageUserPost() {
        return averageUserPost;
    }

    public double getAverageUserComments() {
        return averageUserComments;
    }

    public double getAveragePostComments() {
        return averagePostComments;
    }

    public void showStatistics() {
        System.out.println();
        System.out.println("The Forum has following statistics: ");
        System.out.println("The users quantity: " + usersQuantity);
        System.out.println("Overall post Quantity: " + postQuantity);
        System.out.println("Overall comments quantity: " + commentsQuantity);
        System.out.print("Average number of posts per user: ");
        System.out.format("%.2f%n", averageUserPost);
        System.out.print("Average number of comments per user: ");
        System.out.format("%.2f%n", averageUserComments);
        System.out.print("Average quantity comments per post: ");
        System.out.format("%.2f%n", averagePostComments);
        System.out.println();
    }
}