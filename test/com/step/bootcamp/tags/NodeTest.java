package com.step.bootcamp.tags;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NodeTest {

    @Test
    void shouldRefreshItSelfOnlyWhenThereAreNoChildrenToIt() {
        Node content = new Node("content");
        content.add(new Leaf("Image"));
        content.add(new Leaf("text"));

        String expected = "Refreshing content Refreshing Image Refreshing text";
        assertEquals(expected, content.refresh());
    }

    @Test
    void shouldRefreshWholeBody() {
        Node body = new Node("Body");
        body.add(new Leaf("Side Panel"));

        Node content = new Node("content");
        content.add(new Leaf("Image"));
        content.add(new Leaf("text"));

        body.add(content);
        body.add(new Leaf("Bottom Panel"));

        String expected = "Refreshing Body Refreshing Side Panel " +
                "Refreshing content Refreshing Image Refreshing text " + "Refreshing Bottom Panel";
        assertEquals(expected, body.refresh());
    }
}