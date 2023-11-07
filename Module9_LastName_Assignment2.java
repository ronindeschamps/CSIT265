/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module9_lastname_assignment2;

import static com.mycompany.module9_lastname_assignment2.TreeNode.NLR;
import static com.mycompany.module9_lastname_assignment2.TreeNode.createBiTree;



/**
 *
 * @author ronin
 */
public class Module9_LastName_Assignment2 {
    
    public static void main(String[] args){
        String[] names = {"A", "B", "C", "D", "E", "F", "G"};
        TreeNode root = createBiTree(names);
        
        NLR(root);
   


}
}

