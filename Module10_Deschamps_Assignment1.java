/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module10_deschamps_assignment1;
import java.util.Random;

/**
 *
 * @author ronin
 */
public class Module10_Deschamps_Assignment1 {

    public static void main(String[] args) {
        int[] numbers = new int[5000];
        
        Random random = new Random();
        
         int count = 0;
        for(int i = 0; i < numbers.length; i++, count++){
        int rando = random.nextInt(1000);
        numbers[count] = rando;
    }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        quicksort(numbers, 0, numbers.length - 1);
        System.out.println("");
        System.out.println("quicksort has finished");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
    }}
    
    private static void quicksort(int[] array, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }
        int pivot = array[highIndex];
        int lp = lowIndex;
        int rp = highIndex;
        while (lp < rp){
            while(array[lp] <= pivot && lp < rp){
                lp++;
            }
            while (array[rp] >= pivot && lp < rp){
                rp--;
            }
            swap(array, lp, rp);
        }
        swap(array, lp, highIndex);
        
        quicksort(array, lowIndex, lp-1);
        quicksort(array, lp+1, highIndex);
        
    
}
    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
