package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //task41();
        //task66();
        //task91();
        //task116();
        task141();
    }
    //Дано натуральное число n. Вычислить у = 2 · 4 · 6 ... (2n).
    private  static  void task41(){
        int n = (int) (Math.random() * 10 + 1);
        int y=1;
        for (int i = 2; i <= 2*n; i+=2) {
            y*=i;
        }
        System.out.println("n=" + n + "\ny=" + y);
    }
    //Составить программу для расчёта степени n вещественного числа а (n — натуральное число).
    private  static  void task66(){
        float a = ((float) ((int) (Math.random() * 100 + 1))/10);
        int n = (int) (Math.random() * 10 + 1);
        float result= (float) Math.pow(a,n);
        System.out.println("Число а = "+ a + "\nСтепень n = "+ n +"\nРезультат ="+ result);
    }
    //Даны натуральное число n и вещественные числа а1, a2, …, аn. Определить среднее арифметическое этих чисел.
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
    //Составить программу, которая печатает таблицу умножения и сложения натуральных чисел в десятичной системе счисления.
    private static void task116(){
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t\t");
            }
        }
        System.out.println("\n\n\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print(j+"+"+i+"="+(i+j)+"\t\t");
            }
        }
    }
    //Индийский математик С. Рамануджан обратил внимание на то, что число 1729 можно представить в виде суммы кубов двух чисел двумя способами. Найдите эти числа.
    private static void task141(){
        System.out.println("Числа котопые в кубе в суме дают число 1729 : ");
        int i=0,count =0;
        while (true){
            i++;
            if(Math.pow(i,3)>1729||count==2){
                break;
            }
            int j=0;
            while (true){
                j++;
                if((Math.pow(i,3)+Math.pow(j,3))>1729){
                    break;
                }
                if((Math.pow(i,3)+Math.pow(j,3))==1729){
                    System.out.println(i+"-"+j);
                    count++;
                    break;
                }
            }
        }
    }
}
