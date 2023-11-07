/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module3_deschamps_assignment1;

import java.util.Stack;

/**
 *
 * @author ronin
 */
public class Module3_Deschamps_Assignment1 {

    public static void main(String[] args) {
        
        Stack<Long> fib = new Stack<>();
        
        long i=0,k=0,a=1,b=1;
        fib.push(0L);
        fib.push(1L);
        fib.push(1L);
        while(i<47)
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
    

