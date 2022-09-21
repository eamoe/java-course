package com.gb;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Cats implements Comparable<Cats> {
    private int id;
    private int weight;
    private int age;
    private String name;
    private String breed;
    private String color;
    private String receipt;

    public Cats(int id, int weight, int age, String name, String breed, String color, String receipt) {
        this.id = id;
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.receipt = receipt;
    }

    public Cats(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cats(String name) {
        this(0, 0, 0, name, null, null, null);
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getTable() {
        return receipt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTable(String table) {
        this.receipt = table;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return id == cats.id && Objects.equals(name, cats.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Cats{" +
            "id=" + id +
            ", weight=" + weight +
            ", age=" + age +
            ", name='" + name + '\'' +
            ", breed='" + breed + '\'' +
            ", color='" + color + '\'' +
            ", receipt='" + receipt + '\'' +
            '}';
    }

    @Override
    public int compareTo(@NotNull Cats o) {
        return Integer.compare(this.age, o.age);
    }

    public static void main(String[] args) {
        Set<Cats> cats = new HashSet<>();
        cats.add(new Cats(1, "cat1"));
        cats.add(new Cats(2, "cat2"));
        cats.add(new Cats("cat2"));
        cats.add(new Cats(3, 1, 1, "cat4", "breed1", "color1", "receipt1"));
        cats.add(new Cats(4, 1, 5, "cat4", "breed2", "color2", "receipt2"));
        for (Cats cat : cats) {
            System.out.println(cat);
        }

        Set<Cats> treeCats = new TreeSet<>(cats);
        for (Cats treeCat : treeCats) {
            System.out.println(treeCat);
        }
    }
}
