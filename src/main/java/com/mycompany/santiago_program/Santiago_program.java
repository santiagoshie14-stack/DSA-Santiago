/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.santiago_program;
import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class Santiago_program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Santiago Shiela");
        System.out.println("Enter a number");
        int x = input.nextInt();
        System.out.println("Enter a number");
        int y = input.nextInt();
        int sum, diff, mul, quo;
        sum = x + y; 
        diff = x - y;
        mul = x * y;
        quo = x / y;
        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + diff);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Quotient is: " + quo);
        //mark
        //j
}
}
