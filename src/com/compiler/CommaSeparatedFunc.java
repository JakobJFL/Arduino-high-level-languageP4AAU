package com.compiler;

@FunctionalInterface
public interface CommaSeparatedFunc<T> {
    T invoke(T a);
}

