package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private String input;
    private boolean expectedOutput;

    BalancedBrackets bb = new BalancedBrackets();

    public ParameterizedTest(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> balancedBracketsParameterizedTest(){
        String balancedParens = "(1)";
        String balancedAngleBrackets = "<<>>";
        String balancedComboBrackets = "<({})>";
        String emptyString = "";
        String tooManyOpenParens = "((1";
        String tooManyOpenParens1 = "(1)(";
        String tooManyClosedParens = "(1))";
        String startClosedParens = ")(";
        String mismatchedBrackets = "<({)}>";

        Object[][] expectedOutputs = {
                { balancedParens, true },
                { balancedAngleBrackets, true },
                { balancedComboBrackets, true },
                { emptyString, true },
                { tooManyOpenParens, false },
                { tooManyOpenParens1, false },
                { tooManyClosedParens, false },
                { startClosedParens, false },
                { mismatchedBrackets, false }
        };


        return Arrays.asList(expectedOutputs);

    }

    @Test
    public void testParameterizedTest(){
        assertEquals(expectedOutput, bb.balancedBrackets(input));
    }
}