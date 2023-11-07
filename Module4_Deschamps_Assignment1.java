/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module4_deschamps_assignment1;



import java.util.LinkedList;
import java.util.Random;
import java.util.Queue;
import com.mycompany.Customer;

/**
 *
 * @author ronin
 */

public class Module4_Deschamps_Assignment1{
    
    public static void main(String[] args) {
        
    
        Queue<Customer> custq = new LinkedList<>();
        Random random = new Random();
        int mins = 0;
        
        while (mins <= 720){
            
            Customer customer = new Customer();
            
            mins = mins + random.nextInt(5)+1;
            int arrivalTime = mins;
            int checkoutTime = arrivalTime + random.nextInt(5) + 1;
            customer.setBoth(arrivalTime, checkoutTime);
            custq.add(customer);
            
            if (checkoutTime <= mins) {
                custq.remove();
            }
        }
        System.out.println("Number of customers in the queue with wait time 1-5 minutes: " + custq.size());
    
        Queue<Customer> custq2 = new LinkedList<>();
        int mins2 = 0;
        
        while (mins2 <= 720){
            
            Customer customer2 = new Customer();
            
            mins2 = mins2 + random.nextInt(3)+1;
            int arrivalTime = mins2;
            int checkoutTime = arrivalTime + random.nextInt(3) + 1;
            customer2.setBoth(arrivalTime, checkoutTime);
            custq.add(customer2);
            
            if (checkoutTime <= mins2) {
                custq2.remove();
            }
        }
        System.out.println("Number of customers in the queue with wait time 1-3 minutes: " + custq.size());
    
    
}}
        
        
    
    
    
            
    
        
        
    
    
    


public static class Q{
    Queue<Customer> custq = new LinkedList<>();

    public void insert(Customer customer){
        custq.add(customer);
    }
    
    public Customer remove() {
        return custq.poll();
    }
    
    public Customer peek() {
        return custq.peek();
    }
    
    public boolean search(Customer customer) {
        return custq.contains(customer);
    }
    
}    





