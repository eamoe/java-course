package com.gb.Lesson010;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Box<T extends Fruit> implements Comparable<Box<T>> {

    private final float maxBoxWeight;
    private final float emptyBoxWeight;
    private final ArrayList<T> boxContents;
    private float currentBoxWeight;

    public Box(float emptyBoxWeight, float maxBoxWeight) {
        this.maxBoxWeight = maxBoxWeight;
        this.emptyBoxWeight = emptyBoxWeight;
        this.currentBoxWeight = emptyBoxWeight;
        this.boxContents = new ArrayList<>();
    }

    public float getWeight() {
        float overallWeight = this.emptyBoxWeight;
        for (T fruit: this.boxContents) {
            overallWeight += fruit.weight();
        }
        return overallWeight;
    }

    public float getMaxBoxWeight() {
        return maxBoxWeight;
    }

    public float getCurrentBoxWeight() {
        return currentBoxWeight;
    }

    public void addFruit(T fruit) {

        if ((getWeight() + fruit.weight()) > this.maxBoxWeight) {
            System.out.println("Невозможно добавить еще один фрукт. Коробка полна!");
        }
        else {
            this.boxContents.add(fruit);
            this.currentBoxWeight += fruit.weight();
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

    public ArrayList<T> getBoxContents() {
        return boxContents;
    }

    public static <T extends Fruit> void moveContentsTo(Box<? extends T> fromBox,
                                                        Box<? super T> toBox,
                                                        float maxDestWeight,
                                                        float currentDestWeight) {

        ArrayList<? extends Fruit> fromContents = fromBox.getBoxContents();
        ArrayList<? super T> toContents = toBox.getBoxContents();

        Iterator<? extends Fruit> iterator = fromContents.listIterator();

        while (iterator.hasNext()) {
            Fruit fruit = iterator.next();
            if (currentDestWeight + fruit.weight() > maxDestWeight) {
                System.out.println("Невозможно добавить еще один фрукт. Коробка полна!");
                break;
            }
            else {
                toContents.add((T)fruit);
                iterator.remove();
                currentDestWeight += fruit.weight();
            }
        }
    }

}
