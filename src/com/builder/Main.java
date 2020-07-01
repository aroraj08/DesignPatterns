package com.builder;

public class Main {
    public static void main(String[] args) {
        Person p = new Person.Builder().firstName("Preeti")
                .lastName("Miglani")
                .age(28)
                .gender("female")
                .email("preeti@gmail.com").build();

        System.out.println(p);
    }
}
