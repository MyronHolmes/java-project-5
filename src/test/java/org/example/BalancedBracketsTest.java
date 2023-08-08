package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    String balancedParens = "(1)";
    String tooManyOpenParens = "((1";
    String tooManyOpenParens1 = "(1)(";
    String tooManyClosedParens = "(1))";
    String startClosedParens = ")(";
    String emptyString = "";
    String balancedAngleBrackets = "<<>>";
    String balancedComboBrackets = "<({})>";
    String mismatchedBrackets = "<({)}>";

    BalancedBrackets bb = new BalancedBrackets();


    @Test
    public void testBalancedBrackets_BalancedParens(){
        assertTrue(bb.balancedParentheses(balancedParens));

    }

    @Test
    public void testBalancedBrackets_TooManyOpenParens(){

        assertFalse(bb.balancedParentheses(tooManyOpenParens));
    }

    @Test
    public void testBalancedBrackets_TooManyOpenParens1(){

        assertFalse(bb.balancedParentheses(tooManyOpenParens1));
    }

    @Test
    public void testBalancedBrackets_TooManyClosedParens(){

        assertFalse(bb.balancedParentheses(tooManyClosedParens));
    }

    @Test
    public void testBalancedBrackets_StartClosedParens(){

        assertFalse(bb.balancedParentheses(startClosedParens));
    }

    @Test
    public void testBalancedBrackets_BPEmptyString(){

        assertTrue(bb.balancedParentheses(emptyString));
    }

    @Test
    public void testBalancedBrackets_BBEmptyString(){
        assertTrue(bb.balancedBrackets(emptyString));
    }

    @Test
    public void testBalancedBrackets_BalancedAngleBrackets(){
        assertTrue(bb.balancedBrackets(balancedAngleBrackets));
    }

    @Test
    public void testBalancedBrackets_BalancedComboBrackets(){
        assertTrue(bb.balancedBrackets(balancedComboBrackets));
    }

    @Test
    public void testBalancedBrackets_MismatchedBrackets(){
        assertFalse(bb.balancedBrackets(mismatchedBrackets));
    }

}