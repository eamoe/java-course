package com.gb.Lesson010;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Box<T extends Fruit> implements Comparable<Box<T>> {

    private final float maxBoxWeight;
    private final float emptyBoxWeight;
    private final ArrayList<T> boxContents;

    public Box(float emptyBoxWeight, float maxBoxWeight) {
        this.maxBoxWeight = maxBoxWeight;
        this.emptyBoxWeight = emptyBoxWeight;
        this.boxContents = new ArrayList<>();
    }

    public float getWeight() {
        float overallWeight = this.emptyBoxWeight;
        for (T fruit: this.boxContents) {
            overallWeight += fruit.weight();
        }
        return overallWeight;
    }

    public void addFruit(T fruit) {

        if ((getWeight() + fruit.weight()) > this.maxBoxWeight) {
            System.out.println("Невозможно добавить еще один фрукт. Коробка полна!");
        }
        else {
            this.boxContents.add(fruit);
            System.out.printf("Фрукт добавлен (%s)%n", fruit.name());
        }

    }

    public boolean compare(Box<?> o) {
        return this.compareTo(o) == 0;
    }

    @Override
    public int compareTo(@NotNull Box o) {
        return Float.compare(this.getWeight(), o.getWeight());
    }

}
