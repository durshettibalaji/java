package src.Basics;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class InputOut {
    public static void main(String[] args) {
        try {
            TakingInput us = new TakingInput();
            us.takingInputUsingBuffer();
        } catch (Exception e) {
            System.out.println("Hey we encountered an error   : "+e);
        }
        // try {
        //     TakingInput us = new TakingInput();
        //     us.usingScanner();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

    }
}

class TakingInput {
    void takingInputUsingBuffer() throws Exception {
        System.out.println("give an number as input ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        // bf.close();
        // System.out.println(bf.readLine());
    }

    void usingScanner() {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}