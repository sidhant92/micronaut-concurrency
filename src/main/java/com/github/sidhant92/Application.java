package com.github.sidhant92;

import io.micronaut.runtime.Micronaut;

public class Application {
    public static void main(String[] args) {
        Micronaut.build(args).eagerInitSingletons(false).start();
    }
}
