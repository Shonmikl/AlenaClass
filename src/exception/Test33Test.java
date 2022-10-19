package exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test33Test {


    @Test
    void greetingCorrect() {
        Assertions.assertEquals
                ("Good morning!", Test33.greeting(10));
    }

//    @Test
//    void greetingWithException() {
//        Assertions.assertThrows(, Test33.greeting(100));
//    }
}