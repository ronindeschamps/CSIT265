/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module8_deschamps_assignment1;

import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author ronin
 */
public class Module8_Deschamps_Assignment1 {

    public static void main(String[] args) {
        
        Stack<Long> fib = new Stack<>();
        
        long i=0,k=0,a=1,b=1;
        fib.push(0L);
        fib.push(1L);
        fib.push(1L);
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your input: ");
    int x = scanner.nextInt();


        while(i<x-3)
        {
            k=a+b;
            fib.push(k);
            a=b;
            b=k;
            i+=1;
        }

        
        
        while (!fib.isEmpty()) {
            long element = fib.pop();
            System.out.println(element);
        }
        }   
        }

