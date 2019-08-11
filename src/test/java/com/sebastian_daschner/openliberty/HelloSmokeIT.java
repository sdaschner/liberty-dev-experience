package com.sebastian_daschner.openliberty;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloSmokeIT {

    private HelloSystem helloSystem;

    @BeforeEach
    void setUp() {
        helloSystem = new HelloSystem();
    }

    @Test
    void getFormalGreeting() {
        String greeting = helloSystem.getGreeting("hello");

        assertThat(greeting).isEqualTo("Hello");
    }

    @Test
    void getInformalGreeting() {
        String greeting = helloSystem.getGreeting("hi");

        assertThat(greeting).isEqualTo("Hi");
    }

    @Test
    void getConfig() {
        String greeting = helloSystem.getConfig();

        assertThat(greeting).isEqualTo("Hey");
    }

}