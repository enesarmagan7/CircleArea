package Letcode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CircleArea {


    public static void main(String[] args) {
        double pi=3.14;
        double r;
        int a;
        System.out.println("Daire diliminin yarıçapını giriniz:");
        Scanner sc=new Scanner(System.in);
        r= sc.nextInt();
        System.out.println("Daire diliminin merkez açısını giriniz:");
        a=sc.nextInt();
        double area=(pi*r*r*a)/360;


        System.out.println("Daire diliminin alanı: "+ area);

    }
}
