package com.telus.dsu.introgit.calculator.controller;

public enum OperationsFactory {
    SUM,
    SUB;

    public static OperationController getOperationController(OperationsFactory operation) {
        switch (operation) {
            case SUM:
                return new SumController();
            case SUB:
                return new SubController();
            default:
                return null;
        }
    }
}
