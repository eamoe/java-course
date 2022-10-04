package com.gb.Lesson009;

import org.jetbrains.annotations.NotNull;

public class PersonByNameAge extends Person {

    public PersonByNameAge(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public int compareTo(@NotNull Person o) {
        if (this.getName().compareTo(o.getName()) == 0) {
            if (this.getAge() > o.getAge()) return 1;
            else if (this.getAge() == o.getAge()) return 0;
            else return -1;
        }
        return this.getName().compareTo(o.getName());
    }

}
