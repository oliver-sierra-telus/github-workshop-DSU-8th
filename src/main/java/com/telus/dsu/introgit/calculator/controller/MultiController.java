package com.telus.dsu.introgit.calculator.controller;

import java.util.LinkedList;
import java.util.List;

public class MultiController extends OperationController {
    
    @Override
    public void execute() {
        result = 1;
        String operation = "MULTI: ";
        for(int num: data) {
            result *= num;
            operation+=num + " ,";
        }

        operation+=" = "+result;
        OperationHistoryController.addOperation(operation);
        
    }

    @Override
    protected List<String> initDataDescrition() {
        List<String> dataDescription = new LinkedList<>();
        dataDescription.add("Ingrese el primer numero a multiplicar: ");
        dataDescription.add("Ingrese el segundo numero a multiplicar: ");
        return dataDescription;
    }
}
