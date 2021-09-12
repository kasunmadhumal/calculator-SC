package com.kelani.v5;


import com.kelani.v5.input.CommandLineInputs;
import com.kelani.v5.input.Inputs;
import com.kelani.v5.operation.Operation;
import com.kelani.v5.operation.OperationFactory;
import com.kelani.v5.repository.FileNumberRepository;
import com.kelani.v5.repository.NumberRepository;
import com.kelani.v5.ui.CmdLineUI;
import com.kelani.v5.ui.UI;

public class Main  {

    public static void main(String[] args) throws Exception {

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs, numberRepository, operationFactory, ui);
        app.execute();


    }


}



