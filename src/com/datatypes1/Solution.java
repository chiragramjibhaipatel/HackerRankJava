package com.datatypes1;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                StringJoiner joiner = new StringJoiner("\n");
                if(x>=-128 && x<=127) joiner.add("* byte");
                if(x>=-32768 && x<=32767)joiner.add("* short");
                if(x>=-Math.pow(2, 31) && x<=Math.pow(2, 31)-1)joiner.add("* int");
                if(x>=-Math.pow(2, 63) && x<=Math.pow(2, 63)-1)joiner.add("* long");
                String prefix =
                                x
                                + (joiner.toString().contains("*")?" can be fitted in:":" can't be fitted anywhere.")
                                + "\n"
                                + joiner.toString();
                System.out.println(prefix);
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}



