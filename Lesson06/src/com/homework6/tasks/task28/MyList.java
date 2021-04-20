package com.homework6.tasks.task28;

public class MyList<T> {
    private T[] objects;
    private int size;

    public MyList(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index) {
        return objects[index];
    }
}
