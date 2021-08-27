package com.kelani.calreadtextfile;

public class Calculate {
    public Calculate(String choice, int num[]) {
        try {
            int ans = 0;
            if (choice.equals("add")) {
                ans = num[0] + num[1];
            } else if (choice.equals("sub")) {
                ans = num[0] - num[1];
            } else if (choice.equals("mul")) {
                ans = num[0] * num[1];
            } else {
                System.out.println("Your input not valid");
                System.exit(0);
            }
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println("An error occured in Calculate class");
            System.out.println(e);
        }

    }
}
