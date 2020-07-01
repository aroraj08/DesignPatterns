package com.adapter2;

public interface Iterator<E> {
    public boolean hasNext();
    E next();
    E remove();
}
