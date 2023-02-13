package com.telus.dsu.introgit.calculator.controller;

import java.util.List;

import com.telus.dsu.introgit.calculator.model.OperationHistory;

public class OperationHistoryController {

    public static void addOperation(String operation){
        OperationHistory.addOperation(operation);
    }

    public static List<String> getOperationsHistory(){
        return OperationHistory.getOperationHistory();
    }
    
}
