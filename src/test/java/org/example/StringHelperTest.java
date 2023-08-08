package org.example;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
public class StringHelperTest {


    StringHelper helper = new StringHelper();


    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions(){


        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPosition(){


        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_NoA(){
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInLast2Position(){
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    @Test
    public  void TestAreFirstAndLastTwoCharactersTheSame_BasicNegative(){
        assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD") );
    }

    @Test
    public  void TestAreFirstAndLastTwoCharactersTheSame_BasicNegative2(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD") );
    }

    @Test
    public  void TestAreFirstAndLastTwoCharactersTheSame_BasicPositive(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB") );
    }


}