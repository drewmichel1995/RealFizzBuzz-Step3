package org.example;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealFizzBuzzP3Test {
    @Test
    @DisplayName("Verify correct value is returned from checkNumber")
    void verifyCheckNumber() {
        RealFizzBuzzP3 fizz = new RealFizzBuzzP3();

        assertEquals("lucky", fizz.checkNumber(3), "Integers including 3 must return lucky");
        assertEquals("fizz", fizz.checkNumber(9), "Multiples of 3 that do not include the number 3 must return buzz");
        assertEquals("buzz", fizz.checkNumber(5), "Multiples of 5 must return fizz");
        assertEquals("fizzbuzz", fizz.checkNumber(15), "Multiples of 15 must return fizzbuzz");
        assertEquals("8", fizz.checkNumber(8), "All other integers return the integer as a string");
    }

    @Test
    @DisplayName("Verify correct string is returned from fizzBuzz")
    void verifyFizzBuzz(){
        RealFizzBuzzP3 fizz = new RealFizzBuzzP3();
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz ", fizz.fizzBuzz(1,20), "Verify Fizz Buzz Report");
    }

    @Test
    @DisplayName("Verify correct string is returned from fizzBuzz")
    void verifyGenerateReport(){
        RealFizzBuzzP3 fizz = new RealFizzBuzzP3();
        String result = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz ";
        assertEquals("\nfizz: 4\n" +
                "buzz: 3\n" +
                "fizzbuzz: 1\n" +
                "lucky: 2\n" +
                "integers: 10", fizz.generateReport(result), "Verify Fizz Buzz Count Report");
    }
}
