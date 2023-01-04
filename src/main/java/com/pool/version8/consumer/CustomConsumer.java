package com.pool.version8.consumer;

@FunctionalInterface
public interface CustomConsumer<T> {
    void accept(T t);
}
