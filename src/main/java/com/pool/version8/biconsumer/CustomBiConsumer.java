package com.pool.version8.biconsumer;

@FunctionalInterface
public interface CustomBiConsumer<T, U> {
    void accept(T t, U u);
}
