package com.adapter2;

public class EnumerationIteratorAdapter<E> implements  Iterator<E>{

    private Enumeration enumeration;

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return (E)enumeration.nextElement();
    }

    @Override
    public E remove() {
        return null;
    }
}
