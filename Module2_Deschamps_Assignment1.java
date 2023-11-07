/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module2_deschamps_assignment1;

/**
 *
 * @author ronin
 */
public class Module2_Deschamps_Assignment1 {

    public static void main(String[] args) {
        int[][] matrix = {// 0 1 2 3
                            {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}
                         };
        System.out.println("Run: ");
        System.out.println("Matrix");
        
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("");
        
        int diagonal2 = 0;
        int diagonal1 = 0;
        int Total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
            Total += matrix[i][j];
            if(i==j)
                diagonal1+=matrix[i][j];
            if(i+j==3)
                diagonal2+=matrix[i][j];
            
            }    
        }  
 
        
        System.out.println("Total sum of elements: " + Total);
        
        System.out.println("");
        
        int rTotal1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            rTotal1 += matrix[0][i];         
        }
        System.out.println("Sum row 1: " + rTotal1);
        
        int rTotal2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            rTotal2 += matrix[1][i];         
        }
        System.out.println("Sum row 2: " + rTotal2);        
        
        int rTotal3 = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            rTotal3 += matrix[2][i];         
        }
        System.out.println("Sum row 3: " + rTotal3);
        
        
        int rTotal4 = 0;
        for (int i = 0; i < matrix.length; i++) {
            rTotal4 += matrix[3][i];         
        }
        System.out.println("Sum row 4: " + rTotal4);
        
        System.out.println("");
        
        int cTotal0 = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            cTotal0 += matrix[i][0];
        }
        
        System.out.println("Sum Column 1: " + cTotal0);

        int cTotal1 = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            cTotal1 += matrix[i][1];}
        System.out.println("Sum Column 2: " + cTotal1);
        
    
        int cTotal2 = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            cTotal2 += matrix[i][2];
        }
        System.out.println("Sum Column 3: " + cTotal2);
        
        int cTotal3 = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            cTotal3 += matrix[i][3];
        }
        System.out.println("Sum Column 4: " + cTotal3);
        
        System.out.println("");
        
        System.out.println("Sum Diagonal 1: " + diagonal1);
        
        System.out.println("Sum Diagonal 2: " + diagonal2); 
        
    }   
    }




