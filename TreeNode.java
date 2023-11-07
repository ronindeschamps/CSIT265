/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module6_deschamps_assignment1;

/**
 *
 * @author ronin
 */
class TreeNode {
    String name;
    TreeNode left;
    TreeNode right;

    TreeNode(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }
    
    public static TreeNode createBiTree(String[] array){
        if(array == null || array.length == 0)
        {return null;}
        
        TreeNode root = new TreeNode(array[0]);
        for (int i = 1; i < array.length; i++)
        {insertBiTree(root, array[i]);}
        return root;
    }

    static TreeNode insertBiTree(TreeNode root, String data) {
        if (root == null) {
            return new TreeNode(data);
        }

        if (countRightNodes(root) < countLeftNodes(root)) {
            root.left = insertBiTree(root.left, data);
        } else {
            root.right = insertBiTree(root.right, data);
        }

        return root;
    }
public static int countLeftNodes(TreeNode root){
        int count = 0;
        while(root != null){
            count=count+1;
            root = root.left;
            countLeftNodes(root);
                    
        }
        return count;
        
    }
public static int countRightNodes(TreeNode root){
        int count = 0;
        while(root != null){
            count=count+1;
            root = root.right;
            countRightNodes(root);
                    
        }
        return count;
        
    }
            
    public static void inOrder(TreeNode root) {
    if (root != null) {
                inOrder(root.left);

        System.out.println(root.name);
        inOrder(root.right);
}}
        
                
    
        public static void NLR(TreeNode root) {
    if (root != null) {
                System.out.println(root.name);
        NLR(root.left);
        NLR(root.right);
    }
    }

 
    
        public static void postOrder(TreeNode root) {
    if (root != null) {
        postOrder(root.right);
        System.out.println(root.name);
        postOrder(root.left);
        
    }}
    
      public static void remove(TreeNode root, String targetName) {
    if (root == null) {
        return;
    }

    if (root.name.equals(targetName)) {
        root.name = null;
    } else if (targetName.compareTo(root.name) < 0) {
        remove(root.left, targetName);
    } else {
        remove(root.right, targetName);
    }
}
      
public static TreeNode findMin(TreeNode node) {
    while (node.left != null) {
        node = node.left;
    }
    return node;
}

public static TreeNode deleteNode(TreeNode node, String targetName) {
    if (node == null) {
        return null;
    } else if (targetName.compareTo(node.name) < 0) {
        node.left = deleteNode(node.left, targetName);
    } else if (targetName.compareTo(node.name) > 0) {
        node.right = deleteNode(node.right, targetName);
    } else {
        if (node.left == null) {
            return node.right;
        } else if (node.right == null) {
            return node.left;
        } else {
            TreeNode successor = findMin(node.right);
            node.name = successor.name;
            node.right = deleteNode(node.right, successor.name);
        }
    }
    return node;
}
}

    
    
