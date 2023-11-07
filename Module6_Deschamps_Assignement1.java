/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module6_deschamps_assignment1;

import static com.mycompany.module6_deschamps_assignment1.TreeNode.countLeftNodes;
import static com.mycompany.module6_deschamps_assignment1.TreeNode.countRightNodes;
import static com.mycompany.module6_deschamps_assignment1.TreeNode.createBiTree;
import static com.mycompany.module6_deschamps_assignment1.TreeNode.deleteNode;
import static com.mycompany.module6_deschamps_assignment1.TreeNode.inOrder;
import static com.mycompany.module6_deschamps_assignment1.TreeNode.postOrder;
import static com.mycompany.module6_deschamps_assignment1.TreeNode.preOrder;




/**
 *
 * @author ronin
 */
public class Module6_Deschamps_Assignement1 {
    
    public static void main(String[] args){
        String[] names = {"Daniel", "George", "Adam", "Peter", "Michael", "Jones", "Tom", "Allison", "James", "Brian"};
        TreeNode root = createBiTree(names);

        System.out.println("Binary tree created successfully!");
        System.out.println(root);
        System.out.println("PreOder Traversal");
        preOrder(root);
        System.out.println("InOder Traversal");
        inOrder(root);
        System.out.println("PostOder Traversal");
        postOrder(root);

         System.out.println();
        deleteNode(root, "Peter");
        deleteNode(root, "Brian");

        System.out.println("Peter and Brian have been removed\n");
        System.out.println("PreOder Traversal2");
        preOrder(root);
        System.out.println("InOder Traversal2");
        inOrder(root);
        System.out.println("PostOder Traversal2");
        postOrder(root);

    }}    
    
    

