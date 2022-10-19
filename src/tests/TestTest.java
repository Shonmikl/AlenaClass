package tests;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    Test test = new Test();

    @org.junit.jupiter.api.Test
    void getResult() {
        Assertions.assertEquals(5, test.getResult(2, 2));
    }
}