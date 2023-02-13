package com.telus.dsu.introgit.calculator.model;

import java.util.LinkedList;
import java.util.List;

public class OperationHistory {
    private static List<String> operationsHistory = new LinkedList<>();

    

    public static void addOperation(String operation){
        operationsHistory.add(operation);
    }
    
    public static List<String> getOperationHistory(){
        return List.copyOf(operationsHistory);
    }
}
