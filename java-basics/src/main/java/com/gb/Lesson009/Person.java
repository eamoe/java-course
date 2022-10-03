package com.gb.Lesson009;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
            "Name='" + name + '\'' +
            ", Age=" + age +
            ", Weight=" + weight +
            ", Height=" + height +
            '}';
    }

    @Override
    public int compareTo(@NotNull Person o) {
        if (this.name.compareTo(o.name) == 0) {
            if (this.age > o.age) return 1;
            else if (this.age == o.age) return 0;
            else return -1;
        }
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Сергей", 24, 70, 186));
        people.add(new Person("Алексей", 32, 76, 170));
        people.add(new Person("Дмитрий", 17, 65, 165));
        people.add(new Person("Василий", 18, 81, 195));
        people.add(new Person("Максим", 44, 94, 174));

        Collections.sort(people);
        System.out.println(people);
    }
}
