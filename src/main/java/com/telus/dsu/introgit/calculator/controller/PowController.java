package main.java.com.telus.dsu.introgit.calculator.controller;

import com.telus.dsu.introgit.calculator.controller.OperationController;
import com.telus.dsu.introgit.calculator.controller.OperationHistoryController;

import java.util.LinkedList;
import java.util.List;

public class PowController  extends OperationController{

    @Override
    public void execute() {
        result = 0;
        String operation = "POW: ";
        result = (int) Math.pow(data.get(0), data.get(1));
        operation+=" = "+ result;
        OperationHistoryController.addOperation(operation);
    }

    @Override
    protected List<String> initDataDescrition() {
        List<String> dataDescription = new LinkedList<>();
        dataDescription.add("Ingrese la base");
        dataDescription.add("Ingrese el exponente al que lo quiere elevar: ");

        return dataDescription;
    }
    
}
