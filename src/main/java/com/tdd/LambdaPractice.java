package com.tdd;

public class LambdaPractice {

    interface Email {
        String construct(String name);
    }

    Email email = (name) -> name + "@gmail.com";

    public static void main(String[] args) {
        String karan = new LambdaPractice().email.construct("jaskirat");
        System.out.println(karan);
    }


}
