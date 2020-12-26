package com.javaeof;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
    import java.io.InputStreamReader;
    import java.nio.file.FileSystemNotFoundException;
    import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(br);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(++count + " " + data);
            }
        } catch (FileSystemNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
