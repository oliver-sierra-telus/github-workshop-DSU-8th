package com.telus.dsu.introgit.calculator.controller;

import java.util.LinkedList;
import java.util.List;

public class DivController extends OperationController{
    
    @Override
    public void execute() {
        result = 0;
        String operation = "DIV";
        result = data.get(0) / data.get(1);
        operation += " = "+ result;
        OperationHistoryController.addOperation(operation);
    }

    @Override
    protected List<String> initDataDescrition() {
        List<String> dataDescription = new LinkedList<>();
        dataDescription.add("Ingrese el primer numero a dividir: ");
        dataDescription.add("Ingrese el segundo numero a dividir: ");

        return dataDescription;
    }
}
