package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.creatingOwnFuncInterface;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
