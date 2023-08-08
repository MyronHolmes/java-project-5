package org.example;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    StringHelper helper = new StringHelper();

    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String expectedOutputs [][] = {
        {"AACD", "CD"},
        {"ACD", "CD"}
    };
        return Arrays.asList(expectedOutputs);
    }


    @Test
    public void testTruncateAInFirst2Positions(){
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }

}