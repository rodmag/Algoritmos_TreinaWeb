package com.freecodecamp.HashMaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        examScore.put("Science", 70);
        examScore.put("Math", 80);
        examScore.put("Biology", 75);
        examScore.put("History", 90);

        System.out.println(examScore.toString());
        System.out.println(examScore.get("History"));
        System.out.println("The HashMap size is: " + examScore.size());

        examScore.forEach((subject, score) -> {
            System.out.println(subject + " --> " + score);
        });

        examScore.forEach((subject, score) -> {
            examScore.replace(subject, score + 10);
        });

        System.out.println(examScore.toString());

    }
}
