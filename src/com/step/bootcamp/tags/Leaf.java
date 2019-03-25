package com.step.bootcamp.tags;

public class Leaf implements DOM {

    private String title;

    Leaf(String title) {
        this.title = title;
    }

    @Override
    public String refresh() {
        return "Refreshing " + title;
    }
}
