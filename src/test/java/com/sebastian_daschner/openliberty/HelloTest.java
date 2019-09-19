package com.sebastian_daschner.openliberty;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloTest {

    private Hello hello = new Hello();

    @Test
    void testHello() {
        assertThat(hello.hello()).isEqualTo("Hello");
    }

    @Test
    void testHi() {
        assertThat(hello.hi()).isEqualTo("Hi");
    }

}
