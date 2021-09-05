package com.kelani.v4.operation;

public class OperationFactory {

    public Operation getInstance(String operator){

        Operation operation = null;

        if (operator.equals("add")) {
            operation = (Operation) new AddOperation();

        } else if (operator.equals("sub")) {
            operation = (Operation) new SubOperation();

        } else if (operator.equals("mul")) {
            operation = (Operation) new MulOperation();

        }

        return operation;
    }
}
