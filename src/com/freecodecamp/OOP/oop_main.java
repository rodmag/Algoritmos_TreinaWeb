package com.freecodecamp.OOP;

import java.time.LocalDate;

public class oop_main {
    public static void main(String[] args) {
        User user = new User("Testador", "1995-02-05");

        Book book = new Book("Tao","Lao", 270);
        AudioBook dracula = new AudioBook("Dracula", "jose", 30000);
        Ebook audio = new Ebook("How to sell", "Best Sellers", 280, "PDF");

        System.out.printf("%s was born back in %s and he is now with %d years old",
                user.getName(), user.getBirthDay().toString(), user.age());

        System.out.printf("%s has borrowed these books: %s \n", user.getName(), user.borrwedBooks());

        System.out.println(dracula.toString());

        System.out.println(audio.toString());

    }
}
