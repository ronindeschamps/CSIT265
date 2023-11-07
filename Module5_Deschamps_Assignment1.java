/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module5_deschamps_assignment1;

import java.util.Scanner;

/**
 *
 * @author ronin
 */
public class Module5_Deschamps_Assignment1 {
    
    public static void main(String[] args) {
        
        
        
    LinkedList1 newlist = new LinkedList1();


    newlist.insertBack("James");
    newlist.insertBack("John");
    newlist.insertBack("Michael");
    newlist.insertBack("Peter");
    newlist.insertBack("Allison");
    newlist.insertBack("Daniel");
    newlist.insertBack("George");
    newlist.insertBack("Simon");
    newlist.insertBack("Jason");
    newlist.insertBack("Mark");
  

    System.out.println("Please enter a name");
    
    Scanner name1 = new Scanner(System.in);
    String userInput = name1.next();
    newlist.insertBack(userInput);
        
    System.out.println("Please enter the name you would like to search for");
    
    Scanner key1 = new Scanner(System.in);
    String searchKey = key1.nextLine();
    


    // Search for the element
    boolean found = LinkedList1.search( newlist.head, searchKey);

    if (found) {
        System.out.println("Element " + searchKey + " found");
    } else {
        System.out.println("Element " + searchKey + " not found");
    }
    }

}
