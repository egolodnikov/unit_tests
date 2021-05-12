package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMyHomeWork {
    @Test
    public void test_is_triangle_1() {
        // all sides is not equal and all two sides more one side
        assertTrue(MyHomeWork.isTriangle(3, 4, 5));
    }

    @Test
    public void test_is_triangle_2() {
        // two sides equal and more 0
        assertTrue(MyHomeWork.isTriangle(1, 2, 2));
    }

    @Test
    public void test_is_triangle_3() {
        // two sides equal and more 0
        assertTrue(MyHomeWork.isTriangle(2, 1, 2));
    }

    @Test
    public void test_is_triangle_4() {
        // all side is equal
        assertTrue(MyHomeWork.isTriangle(1, 1, 1));
    }


    @Test
    public void test_is_triangle_5() {
        // all sides is double
        assertTrue(MyHomeWork.isTriangle(3.0, 4.0, 5.0));
    }

    @Test
    public void test_is_not_triangle_1() {
        // < 0 side
        assertFalse(MyHomeWork.isTriangle(-1, 1, 2));
    }

    @Test
    public void test_is_not_triangle_2() {
        // < 0 side
        assertFalse(MyHomeWork.isTriangle(1, -1, 2));
    }

    @Test
    public void test_is_not_triangle_3() {
        // < 0 side
        assertFalse(MyHomeWork.isTriangle(1, 1, -2));
    }

    @Test
    public void test_is_not_triangle_4() {
        // all side = 0
        assertFalse(MyHomeWork.isTriangle(0, 0, 0));
    }

    @Test
    public void test_is_not_triangle_5() {
        // two sides -1 == -1, but < 0
        assertFalse(MyHomeWork.isTriangle(-1, -1, 1));
    }

    @Test
    public void test_is_not_triangle_6() {
        // two sides -1 == -1, but < 0
        assertFalse(MyHomeWork.isTriangle(1, -1, -1));
    }

    @Test
    public void test_is_not_triangle_7() {
        // two sides -1 == -1, but < 0
        assertFalse(MyHomeWork.isTriangle(-1, 1, -1));
    }

    @Test
    public void test_is_not_triangle_8() {
        // all sides is chars
        assertFalse(MyHomeWork.isTriangle('a', 'b', 'c'));
    }

    @Test
    public void test_is_not_triangle_9() {
        // two sides equal and more 0, but a + b = c
        assertFalse(MyHomeWork.isTriangle(1, 1, 2));
    }

    @Test
    public void test_is_not_triangle_10() {
        // all sides is not equal, but 2 sides a + b = c
        assertFalse(MyHomeWork.isTriangle(1, 2, 3));
    }

}
