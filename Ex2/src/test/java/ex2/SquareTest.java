package ex2;


import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private Square squareTest;

    @BeforeEach
    void setUp() {
        System.out.println("Start testcase...");
        squareTest = new Square(5.0);
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        assertEquals(25.0, squareTest.getArea());
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        assertEquals(20.0, squareTest.getPerimeter());
    }
}