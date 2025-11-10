package org.example.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private int size;
    private String name;

    public String voice() {
        return "Woof";
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
}
