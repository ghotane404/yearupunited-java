package test;

import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    public static void main(String[] args) {
        String s = "hello";
        int ascii;
        int ascii2;
        int length;
        int total = 0;
        int total2 = 0;

        length = s.length() - 1;

        for (int i = 0; i < length; i++){
            char a = (s.charAt(i));
            ascii = (int) a;
            char b = (s.charAt(i + 1));
            ascii2 = (int) b;
            for(int j = 0; j <= 1; j++){
                total = Math.abs(ascii - ascii2);
            }
            total2+= total;
        }
        System.out.print(total2);
    }
}