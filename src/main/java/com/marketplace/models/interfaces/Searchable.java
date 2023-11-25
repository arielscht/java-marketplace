package com.marketplace.models.interfaces;

public interface Searchable<T> {
    public T findById(int id);
}
