package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        task41();
    }
    private  static  void task41(){
        int n = (int) (Math.random() * 10 + 1);
        int y=1;
        for (int i = 2; i <= 2*n; i+=2) {
            y*=i;
        }
        System.out.println("n=" + n + "\ny=" + y);
    }
}
