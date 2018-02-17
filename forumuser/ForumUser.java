package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueUserIdentifier;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPostQuantity;

    public ForumUser(final int uniqueUserIdentifier, final String userName, final char sex, final int year, final int month, final int day, final int publishedPostQuantity) {
        this.uniqueUserIdentifier = uniqueUserIdentifier;
        this.userName = userName;
        this.sex = sex;
        this.birthDate =LocalDate.of(year, month, day);
        this.publishedPostQuantity = publishedPostQuantity;
    }

    public int getUniqueUserIdentifier() {
        return uniqueUserIdentifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;    }

    public LocalDate getBirthDate() {
        return birthDate;
    }


    public int getPublishedPostQuantity() {
        return publishedPostQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "unicUserIdentifier=" + uniqueUserIdentifier +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publishedPostQuantity=" + publishedPostQuantity +
                '}';
    }
}