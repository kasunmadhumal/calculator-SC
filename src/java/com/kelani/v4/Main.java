package com.kelani.v4;


import com.kelani.v4.operation.*;
import com.kelani.v4.operation.Operation;

public class Main  {

    public static void main(String[] args) throws Exception {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();


        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);

        Double result = operation.execute(numbers);

         UI ui = new UI();
         ui.showMessage("The result is " + result);


    }


}



