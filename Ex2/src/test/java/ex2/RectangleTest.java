package ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangleTest;

    @BeforeEach
    void setUp() {
        System.out.println("Start testcase ...");
        rectangleTest = new Rectangle(3.0, 6.0);
    }

    @Test
    void getArea() {
        assertEquals(18.0, rectangleTest.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(18.0, rectangleTest.getPerimeter());
    }
}