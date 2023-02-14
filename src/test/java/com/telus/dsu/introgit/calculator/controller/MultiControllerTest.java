package com.telus.dsu.introgit.calculator.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MultiControllerTest {
    @Test
    public void shouldDMultipleNumbers() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(7);

        OperationController multi = new  MultiController();
        multi.setData(numberList);
        multi.execute();
        assertEquals(70, multi.getResult());
    }

    @Test
    public void testInitDataDescrition() {

    }
}