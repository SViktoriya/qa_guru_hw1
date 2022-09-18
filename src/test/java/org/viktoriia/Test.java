package org.viktoriia;

import org.junit.jupiter.api.Assertions;

public class Test {

    @org.junit.jupiter.api.Test
    void Test1() {
        Assertions.assertFalse(5 < 1);
    }

    @org.junit.jupiter.api.Test
    void exampleTest1() {
        Assertions.assertTrue(2 >= 2);
    }
}
