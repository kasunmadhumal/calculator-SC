package com.kelani.calreadtextfile;

public class Cal {

    public static void main(String[] args) {
        new UserInput();
        new ReadTextFile();
        new Calculate(UserInput.choice, ReadTextFile.num);

    }

}
