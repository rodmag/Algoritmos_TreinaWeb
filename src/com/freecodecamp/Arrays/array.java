package com.freecodecamp.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        char vowels[] = new char[5];

        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        // As a char.
        System.out.println(vowels);

        // Converted to String.
        System.out.println(java.util.Arrays.toString(vowels));

        // Array length
        System.out.println(vowels.length);

        char vowels2[] = {'u', 'o', 'i', 'e', 'a'};

        Arrays.sort(vowels2);

        System.out.println(Arrays.toString(vowels2));

        char key = 'o';
        int founditemIndex = Arrays.binarySearch(vowels2, key);

        System.out.println(Arrays.toString(vowels2));
        System.out.printf("The item was founded in %d", founditemIndex);

        int numbers[] = {1,2,3,4,5};

        int copyOfNumbers[] = Arrays.copyOf(numbers,numbers.length);

        //Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
        System.out.println(Arrays.equals(numbers, copyOfNumbers));

    }
}
