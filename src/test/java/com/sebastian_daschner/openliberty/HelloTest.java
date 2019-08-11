package com.sebastian_daschner.openliberty;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class HelloTest {

    private final Hello hello = new Hello();

    @Test
    void testHello() {
        String greeting = hello.hello();
        assertThat(greeting).isEqualTo("Hello");
    }

    @Test
    void testHi() {
        String greeting = hello.hi();
        assertThat(greeting).isEqualTo("Hi");
    }

}