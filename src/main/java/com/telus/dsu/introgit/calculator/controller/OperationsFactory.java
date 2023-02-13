package com.telus.dsu.introgit.calculator.controller;

import main.java.com.telus.dsu.introgit.calculator.controller.PowController;

public enum OperationsFactory {
    SUM, POW;

    public static OperationController getOperationController(OperationsFactory operation) {
        switch (operation) {
            case SUM:
                return new SumController();


            case POW:
                return new PowController();
                
            default:
                return null;
        }
    }
}
