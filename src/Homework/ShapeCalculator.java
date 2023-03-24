package Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCalculator {
    ShapeCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ShapeCalculator();
    }

    @Test
    @DisplayName("Simple additions works")
    void totalSquare(int a,int b) {
        assertEquals(150,calculator.totalSquare(50,100),"50+100 should be 150";)
    }
    @Test
    @DisplayName("Simple additions works")
    void additions(int i, int i1){
        assertEquals(150,calculator.additions(50,100);,"50+100 should be 150");
    }
}