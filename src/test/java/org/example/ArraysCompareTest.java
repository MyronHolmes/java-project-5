package org.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysCompareTest {

    @Test
    public void test(){
        int[] numbers = {12,3,4,1};
        int[] expexted = {1,3,4,12};

        Arrays.sort(numbers);

        assertArrayEquals(expexted, numbers);
    }


    @Test
    public void testExceptions(){
        int[] numbers = null;

        try {
            Arrays.sort(numbers);
        } catch (NullPointerException e){
//            Success
        }
    }

    @Test(expected = NullPointerException.class)
    public void testExceptions2(){
        int[] numbers = null;

        Arrays.sort(numbers);
    }

    @Test(timeout = 100)
    public void testSort_Performance(){
        int[] array = {12,23,4};
        for (int i= 1; i<=100_000_000; i++){
            array[0] = i;
            Arrays.sort(array);
        }
    }

}