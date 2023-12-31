package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {
    private int[] missingMax = {1, 2, 3, 4, 5, 6, 7, 8, 9};
   private int[] missingNone = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   private int[] missingSeven = {1, 2, 3, 4, 5, 6, 8, 9, 10};

   MissingNumber mn = new MissingNumber();


   @Test
   public void testMissingNumber_MissingMax(){
       assertEquals(10, mn.missingNumber(missingMax, 10) );
   }

   @Test
    public void testMissingNumber_MissingNone(){
        assertEquals(0, mn.missingNumber(missingNone, 10) );
    }

    @Test
    public void testMissingNumber_MissingSeven(){
        assertEquals(7, mn.missingNumber(missingSeven, 10) );
   }

}