package com.freecodecamp.strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        char percentSign = '%';
        String name2 = "teste";
        int age = 44;
        String name3 = "";
        String text = "The sky is red.";

        String formattedString = String.format("This is my name %s. And I have %d years old", name2, age);

        System.out.println(formattedString);
        System.out.println(name3.isEmpty());

        System.out.println(text.replace("red", "blue"));
        System.out.println(text.toUpperCase());
        System.out.println(text.contains("sky"));

    }
}
