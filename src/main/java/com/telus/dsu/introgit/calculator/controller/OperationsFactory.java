package com.telus.dsu.introgit.calculator.controller;

public enum OperationsFactory {
    SUM, DIV;

    public static OperationController getOperationController(OperationsFactory operation) {
        switch (operation) {
            case SUM:
                return new SumController();
            case DIV:
                return new DivController();
            default:
                return null;
        }
    }
}
