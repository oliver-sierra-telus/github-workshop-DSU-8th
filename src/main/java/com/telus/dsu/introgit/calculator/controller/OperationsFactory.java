package com.telus.dsu.introgit.calculator.controller;

public enum OperationsFactory {
    SUM, MULTI;

    public static OperationController getOperationController(OperationsFactory operation) {
        switch (operation) {
            case SUM:
                return new SumController();
            case MULTI:
                return new MultiController();
            default:
                return null;
        }
    }
}
