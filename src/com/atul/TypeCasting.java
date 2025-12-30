package com.atul;

public class TypeCasting {
    public static void main(String[] args) {
        int maxScore = 500;
        int myScore = 423;
         double percentage = (double)myScore/maxScore*100.0d;
        System.out.println("my score is "+ percentage);
    }
}
