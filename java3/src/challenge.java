import java.util.Scanner;

public class challenge {
    public static void main(String[] args){
        System.out.println("taking marks as input from user giving percentage as output");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the subject 1 marks");
        short a = sc.nextShort();
        System.out.println("enter the subject 2 marks");
        short b =sc.nextShort();
        System.out.println("enter the subject 3 marks");
        short c =sc. nextShort();
        System.out.println("enter the subject 4 marks");
        short d = sc.nextShort();
        System.out.println("enter the subject 5 marks");
        short e = sc.nextShort();
        System.out.println("enter the subject 6 marks");
        short f = sc.nextShort();
        System.out.println("enter the subject total marks");
        int total = sc.nextInt();
        int sum = a+b+c+d+e+f;
        System.out.println(sum);
        float div = (float) sum/total;
        System.out.println(div);
        float percentage= div*100;
        System.out.println("the percentage is");
        System.out.println(percentage);
    }
}
