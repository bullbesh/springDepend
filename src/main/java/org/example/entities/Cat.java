package org.example.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private int size;
    private String name;

    public String voice() {
        return "Meow";
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
    public void setName(String name) {
        this.name = name;
    }
}
