package com.sebastian_daschner.openliberty;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloIT {

    private HelloSystem helloSystem = new HelloSystem();

    @Test
    void testHi() {
        String greeting = helloSystem.getGreeting("hi");
        assertThat(greeting).isEqualTo("Hi");
    }

    @Test
    void testHello() {
        String greeting = helloSystem.getGreeting("hello");
        assertThat(greeting).isEqualTo("Hello");
    }

    @Test
    void testConfig() {
        String config = helloSystem.getConfig();
        assertThat(config).isEqualTo("Hey");
    }

}
