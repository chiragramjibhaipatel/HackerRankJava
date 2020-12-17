package com.conditional;

import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        String output="";
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2 != 0){
            output = "Weird";
        } else if(N >=2 && N<=5){
            output = "Not Weird";
        } else if (N>=6 && N<=20){
            output = "Weird";
        } else if(N>20){
            output = "Not Weird";
        }
        System.out.println(output);
    }
}
