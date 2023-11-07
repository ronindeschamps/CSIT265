/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module7_deschamps_assignment1;

import static com.mycompany.module7_deschamps_assignment1.Module7_Deschamps_Assignment1.Fibonacci.fib;
import static com.mycompany.module7_deschamps_assignment1.Module7_Deschamps_Assignment1.Fibonacci.fibextend;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 *
 * @author ronin
 */
public class Module7_Deschamps_Assignment1 {


public class Fibonacci {
    
    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static List<Integer> fibextend(int n) {
        List<Integer> fibsequence = new ArrayList<>();
        if (n == 0) {
            fibsequence.add(0,0);
            return fibsequence;
        } else {
            int x = fib(n);
            fibsequence.add(0,x);
            fibsequence.addAll(0,fibextend(n - 1));
                return fibsequence;
        }
    }
public class Module3_Deschamps_Assignment1 {

    public static void main(String[] args) {
        
        Stack<Long> fib = new Stack<>();
        
        long i=0,k=0,a=1,b=1;
        fib.push(0L);
        fib.push(1L);
        fib.push(1L);
        
        FibStacker(fib, 0L, 1L, 1L, 47);

        while (!fib.isEmpty()) {
            long element = fib.pop();
            System.out.println(element);
        }
        }
        
        private static void FibStacker(Stack<Long> fib, long i, long a, long b, int limit) {
        if (i <= limit) {
            long k = a + b;
            fib.push(k);
            FibStacker(fib, i + 1, b, k, limit);
        }
    }            
        }

}
    public static void main(String[] args) {
        int n = 55;
        System.out.println(fibextend(n));
        }
    }

