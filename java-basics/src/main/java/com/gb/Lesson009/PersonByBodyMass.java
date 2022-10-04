package com.gb.Lesson009;

import org.jetbrains.annotations.NotNull;

public class PersonByBodyMass extends Person{

    public PersonByBodyMass(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public int compareTo(@NotNull Person o) {
        return Double.compare(this.getWeight() / Math.pow((double) this.getHeight() / 100, 2),
            o.getWeight() / Math.pow((double) o.getHeight() / 100, 2));
    }

}
