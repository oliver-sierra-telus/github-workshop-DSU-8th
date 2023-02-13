package com.telus.dsu.introgit.calculator.controller;

import java.util.LinkedList;
import java.util.List;

public class SubController extends OperationController{


    @Override
    public void execute() {
        result = 0;
        String operation = "SUB: ";
        for (int num : data) {
            if(result == 0){
                result = num;
                operation+=num +" ,";
                continue;
            }
            result-=num;
            operation+=num +" ,";
        }

        operation+=" = "+ result;
        OperationHistoryController.addOperation(operation);
    }

    @Override
    protected List<String> initDataDescrition() {
        List<String> dataDescription = new LinkedList<>();
        dataDescription.add("Ingrese el primer numero a restar: ");
        dataDescription.add("Ingrese el segundo numero a restar: ");

        return dataDescription;
    }
    
}
