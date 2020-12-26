package com.static_initializer;

import sun.awt.util.IdentityLinkedList;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int B;
    public static int H;
    public static boolean flag = false;
    static {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            B = Integer.parseInt(br.readLine());
            H = Integer.parseInt(br.readLine());
            if(B < 0 | H < 0){
                throw new IllegalArgumentException("java.lang.Exception: Breadth and height must be positive");
            }
            flag = true;
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

