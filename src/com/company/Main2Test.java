package com.company;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main2Test {

    @Test
    public void mainTestInput() {
        String input = "1\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // invoke
        String[] args = {};
        Main2.main(args);

        // (expected) output
        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 1.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 6.283185307179586" + System.getProperty("line.separator");
        consoleOutput += " and the area is 3.141592653589793." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    // radius 3, circum 18.849555921539, area 28.274333882308
    @Test
    public void mainTestInput3() {
        String input = "3\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // invoke
        String[] args = {};
        Main2.main(args);

        // (expected) output
        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 3.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 18.84955592153876" + System.getProperty("line.separator");
        consoleOutput += " and the area is 28.274333882308138." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    // radius 0, circum 0, area 0

    // radius -1, error "radius must be positive"

    // radius "abc"
}