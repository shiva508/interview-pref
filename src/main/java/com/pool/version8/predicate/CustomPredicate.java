package com.pool.version8.predicate;

@FunctionalInterface
public interface CustomPredicate<T> {
    boolean test(T t);
}
