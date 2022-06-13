package org.echocat.kata.kotlin.part1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


internal class MainAppAppUnitTest {

    @Test
    fun getHelloWorldText() {
        assertThat(MainApp().getHelloWorldText())
            .isEqualTo("Hello world!")
    }
}
