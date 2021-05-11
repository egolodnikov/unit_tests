package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestMain {

    @Test
    public void test_is_triangle_1() {
        assertTrue(Main.isTriangle(3, 4, 5));
    }

    @Test
    public void test_is_triangle_2() {
        assertTrue(Main.isTriangle(5, 12, 13));
    }

    @Test
    public void test_is_triangle_3() {
        assertTrue(Main.isTriangle(3, 13, 12));
    }

    @Test
    public void test_is_triangle_4() {
        assertTrue(Main.isTriangle(12, 5, 13));
    }

    @Test
    public void test_is_triangle_5() {
        assertTrue(Main.isTriangle(12, 13, 5));
    }

    @Test
    public void test_is_NOT_triangle_1() {
        assertFalse(Main.isTriangle(5, 7, 13));
    }

    @Test
    public void test_is_NOT_triangle_2() {
        assertFalse(Main.isTriangle(5, 13, 7));
    }

    @Test
    public void test_is_NOT_triangle_3() {
        assertFalse(Main.isTriangle(13, 5, 7));
    }

    @Test
    public void test_is_NOT_triangle_4() {
        assertFalse(Main.isTriangle(13, 7, 5));
    }

    @Test
    public void test_is_NOT_triangle_5() {
        assertFalse(Main.isTriangle(13, 7, 5));
    }

    @Test
    public void test_is_NOT_triangle_6() {
        // This is NOT a triangle...and yet...
        assertFalse(Main.isTriangle(5, 9, 3));
    }

    @Test
    public void test_is_NOT_triangle_7() {
        // ...just no...
        assertFalse(Main.isTriangle(1, 2, -1));
    }

//    @Test
//    public void test_main_program_1() {
//        ByteArrayInputStream in = new ByteArrayInputStream("5\n12\n13\n".getBytes());
//        System.setIn(in);
//
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(out));
//
//        String consoleOutput = "Enter side 1: \n";
//        consoleOutput += "Enter side 2: \n";
//        consoleOutput += "Enter side 3: \n";
//        consoleOutput += "This is a triangle.\n";
//
//        assertEquals(consoleOutput, out.toString());
//    }
}
