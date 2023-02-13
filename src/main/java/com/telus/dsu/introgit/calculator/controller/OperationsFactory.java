package com.telus.dsu.introgit.calculator.controller;

public enum OperationsFactory {
    SUM, 
    MULTI,
    POW,
    SUB;

    public static OperationController getOperationController(OperationsFactory operation) {
        switch (operation) {
            case SUM:
                return new SumController();
                
            case MULTI:
                return new MultiController();

            case POW:
                return new PowController();
                
            case SUB:
                return new SubController();
            default:
                return null;
        }
    }
}
