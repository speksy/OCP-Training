package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.creatingOwnFuncInterface;

public interface QuadFunction<T, U, V, W, R> {
    R apply(T t, U u, V v, W w);
}
