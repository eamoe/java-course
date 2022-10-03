package com.gb.Lesson009;

import java.util.ArrayList;

public class Individual {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Individual(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    private static int compare(Individual o1, Individual o2) {
        return Integer.compare(o1.age, o2.age);
    }

    @Override
    public String toString() {
        return "Individual{" +
            "Name='" + name + '\'' +
            ", Age=" + age +
            ", Weight=" + weight +
            ", Height=" + height +
            '}';
    }

    public static void main(String[] args) {
        ArrayList<Individual> people = new ArrayList<>();
        people.add(new Individual("Сергей", 24, 70, 186));
        people.add(new Individual("Алексей", 32, 76, 170));
        people.add(new Individual("Дмитрий", 17, 65, 165));
        people.add(new Individual("Василий", 18, 81, 195));
        people.add(new Individual("Максим", 44, 94, 174));

        people.sort(Individual::compare);
        System.out.println(people);
    }

}
