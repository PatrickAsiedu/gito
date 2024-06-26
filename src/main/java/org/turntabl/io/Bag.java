package org.turntabl.io;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private List<T> items;

    public Bag() {
        this.items = new ArrayList<>();
    }


    public void add(T item) {
        items.add(item);
    }


    public void remove(T item) {
        items.remove(item);
    }


    public void clear() {
        items.clear();
    }

    public List<T> getItems() {
        return items;
    }
}
