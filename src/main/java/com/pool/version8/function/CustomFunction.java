package com.pool.version8.function;

@FunctionalInterface
public interface CustomFunction<T, R> {
    R apply(T t);
}
