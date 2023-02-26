package Seminar.S3;

import java.util.Stack;

public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private int age;
    private static Sorter sort;

    public static void setSorter(Sorter sort) {
        User.sort = sort;
    }

    
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName + ", age = " + age + "\n";
    }


    @Override
    public int compareTo(User o) {
        return sort.compare(this, o);
    }

    public static abstract class Sorter {
        public abstract int compare(User u1, User u2);
    }

    public static class SorterFirstName extends Sorter {

        @Override
        public int compare(User u1, User u2) {
            return u1.firstName.compareTo(u2.firstName);
        }
    }

    public static class SorterLastName extends Sorter {

        @Override
        public int compare(User u1, User u2) {
            return u1.lastName.compareTo(u2.lastName);
        }

    }
}
