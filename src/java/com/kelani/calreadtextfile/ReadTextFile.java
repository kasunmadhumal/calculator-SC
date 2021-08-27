package com.kelani.calreadtextfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    static int[] num = new int[2];

    public ReadTextFile() {
        try {
            File myfile = new File("calculator\\src\\java\\com\\kelani\\calreadtextfile\\numbers.txt");
            Scanner myReader = new Scanner(myfile);
            int i = 0;
            while (myReader.hasNextInt()) {
                num[i] = myReader.nextInt();
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured in numbers.txt file");
            e.printStackTrace();
        }
    }
}
