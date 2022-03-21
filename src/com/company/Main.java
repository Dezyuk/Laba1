package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //task41();
        //task66();
        //task91();
        task116();
    }
    private  static  void task41(){
        int n = (int) (Math.random() * 10 + 1);
        int y=1;
        for (int i = 2; i <= 2*n; i+=2) {
            y*=i;
        }
        System.out.println("n=" + n + "\ny=" + y);
    }
    private  static  void task66(){
        float a = ((float) ((int) (Math.random() * 100 + 1))/10);
        int n = (int) (Math.random() * 10 + 1);
        float result= (float) Math.pow(a,n);
        System.out.println("Число а = "+ a + "\nСтепень n = "+ n +"\nРезультат ="+ result);
    }
    private  static  void  task91(){
        int n = (int) (Math.random() * 10 + 1);
        float sum=0;
        for (int i = 0; i < n; i++) {
            float a = ((float) ((int) (Math.random() * 100 + 1))/10);
            System.out.println(a);
            sum+=a;
        }
        System.out.println(n);
        System.out.println("Среднее арефметическое = "+ sum/n);
    }
    private static void task116(){

    }
}
