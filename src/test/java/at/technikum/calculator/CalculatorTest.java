package at.technikum.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void initialise(){
        calc = new Calculator();
    }

    @Test
    void sum(){
        //arrange
        Calculator calc = new Calculator();
        int a = 5;
        int b = 10;

        // act
        int result = calc.sum(a,b);

        //assert
        assertEquals(15, result);

    }

    @Test
    void multiplicationTestNormalUsage(){
        // arrange
        int a = 2;
        int b = 3;

        // act
        int result = calc.multiply(a, b);

        // assert
        assertEquals(6, result);
    }
}
