package ru.salnikovam.api;

import java.util.HashSet;

public class Program{
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        
        HashSet<Cat> cats = new HashSet<>();

        cats.add(new Cat("Муся", "серый", "ориентал", 1.234));
        cats.add(new Cat("Буся", "черный", "сиамская", 2.123));
        cats.add(new Cat("Вася", "белая", "перс", 3.123));

        System.out.println();
        System.out.println(cats);

        Cat catGray = new Cat("Муся", "серый", "ориентал", 1.234);
        Cat catVas = new Cat("Вася", "белая", "перс", 3.123);
        cats.add(catGray);
        cats.add(catVas);

        System.out.println();
        System.out.println(cats);

    }
}

