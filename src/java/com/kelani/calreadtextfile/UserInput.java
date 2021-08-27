package com.kelani.calreadtextfile;

import java.util.Scanner;

public class UserInput {

    static String choice;

    public UserInput() {
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter operator :\n" +
                    "1. add\n" +
                    "2. sub\n" +
                    "3. mul\n");
            choice = obj.nextLine();
            obj.close();
        } catch (Exception e) {
            System.out.println("An error occured in UserInput class");
            System.out.println(e);
        }
    }

}
