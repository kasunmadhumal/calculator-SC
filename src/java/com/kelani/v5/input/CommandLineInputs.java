package com.kelani.v5.input;

public class CommandLineInputs implements Inputs{

    private final String[] args;

    //Constructor
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator() {
        if (args.length == 0) {
            System.out.println("Please provie the operation as an argument");
            return "";
        }
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            System.out.println("please provide the add , sub or mul as the operator argument");
            return "";

        }
        return operator;

    }


}
