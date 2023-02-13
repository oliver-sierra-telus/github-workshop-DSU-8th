package com.telus.dsu.introgit.calculator.controller;

import main.java.com.telus.dsu.introgit.calculator.controller.PowController;

public enum OperationsFactory {
    SUM, 
    POW,
    SUB;

    public static OperationController getOperationController(OperationsFactory operation) {
        switch (operation) {
            case SUM:
                return new SumController();

            case POW:
                return new PowController();
                
            case SUB:
                return new SubController();
            default:
                return null;
        }
    }
}
