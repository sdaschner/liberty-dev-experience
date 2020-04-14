package com.sebastian_daschner.openliberty;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloIT {

    private final HelloSystem helloSystem = new HelloSystem();

    @Test
    void testHello() {
        assertThat(helloSystem.getGreeting("hello")).isEqualTo("Hello");
    }

    @Test
    void testConfig() {
        assertThat(helloSystem.getConfig()).isEqualTo("Hey");
    }

}
