/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module11_deschamps_assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Module11_Deschamps_Assignment1 {

    public static void main(String[] args) {
        Graph graph1 = new Graph();

        Node nodeA = new Node('A');
        Node nodeB = new Node('B');
        Node nodeC = new Node('C');
        Node nodeD = new Node('D');
        Node nodeE = new Node('E');

        graph1.addNode(nodeA);
        graph1.addNode(nodeB);
        graph1.addNode(nodeC);
        graph1.addNode(nodeD);
        graph1.addNode(nodeE);

        graph1.addEdge(nodeA, nodeB);
        graph1.addEdge(nodeB, nodeC);
        graph1.addEdge(nodeB, nodeE);
        graph1.addEdge(nodeC, nodeD);
        graph1.addEdge(nodeC, nodeE);
        graph1.addEdge(nodeE, nodeA);
        graph1.addEdge(nodeE, nodeC);

        graph1.print();
        Node startingNode = nodeE;
        Set<Character> visited = new HashSet<>();
        Graph.DFS(visited, graph1, startingNode);
    }
}
