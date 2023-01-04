package com.pool.version8.bipredicate;

@FunctionalInterface
public interface CustomBiPredicate<T, U> {
    boolean test(T t, U u);
}
