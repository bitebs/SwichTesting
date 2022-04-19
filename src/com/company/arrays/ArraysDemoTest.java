package com.company.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysDemoTest {
    @Test
    public void getMissing(){
        assertEquals(5, ArraysDemo.getMissing(new int[]{3,2,4,6,1}));
    }

}