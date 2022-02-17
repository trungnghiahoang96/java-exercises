package ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circleTest;

    @BeforeEach
    void setUp() {
        System.out.println("Start testcase ...");
        circleTest = new Circle(3.0);
    }

    @Test
    void getArea() {
        assertEquals(28.27, circleTest.getArea(), 0.1);
    }

    @Test
    void getPerimeter() {
        assertEquals(18.85, circleTest.getPerimeter(), 0.1);
    }
}