package com.step.bootcamp.tags;

import java.util.ArrayList;
import java.util.List;

public class Node implements DOM {

    private String title;
    private List<DOM> children;

    Node(String title) {
        this.title = title;
        this.children = new ArrayList<>();
    }

    void add(DOM dom) {
        this.children.add(dom);
    }

    @Override
    public String refresh() {
        StringBuilder result = new StringBuilder("Refreshing " + title);
        for (DOM child : children) {
            result.append(" ").append(child.refresh());
        }
        return result.toString();
    }
}
