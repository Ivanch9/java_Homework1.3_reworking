package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int n = sc.nextInt();
        int n0 = n;
        int ndig = 0; // число десятичных цифр в числе
        while (n>0)
        {
            ndig++;
            n /= 10;
        }
        ndig /= 2;

        n = n0;

        int sum1 = 0;
        while (n>0 && ndig > 0 )
        {
            sum1 += n % 10;
            n /= 10;
            ndig--;
        }
        int sum2 = 0;

        while (n>0)
        {
            sum2 += n % 10;
            n /= 10;
        }

        if (sum1 == sum2)
            System.out.println("Lucky ticket " + " sum1 = " + sum1 + " sum2 = " + sum2);
        else
            System.out.println("Unlucky ticket " + " sum1 = " + sum1 + " sum2 = " + sum2);
    }
}