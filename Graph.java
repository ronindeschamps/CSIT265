/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module11_deschamps_assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ronin
 */

class Graph {
    private Map<Node, List<Node>> adjlist;

    Graph() {
        adjlist = new HashMap<>();
    }

    public void addNode(Node node) {
        adjlist.put(node, new ArrayList<>());
    }

    public void addEdge(Node src, Node dst) {
        List<Node> srcNeighbors = adjlist.get(src);
        if (srcNeighbors != null) {
            srcNeighbors.add(dst);
        }
    }

    public void print() {
        for (Map.Entry<Node, List<Node>> entry : adjlist.entrySet()) {
            Node node = entry.getKey();
            List<Node> neighbors = entry.getValue();

            System.out.print(node.data + " -> ");
            for (Node neighbor : neighbors) {
                System.out.print(neighbor.data + " ");
            }
            System.out.println();
        }
    }

    public List<Node> getNeighbors(Node node) {
        return adjlist.get(node);
    }

    public static void DFS(Set<Character> visited, Graph graph, Node node) {
        if (!visited.contains(node.data)) {
            System.out.println(node.data + " visited");
            visited.add(node.data);
            List<Node> neighbors = graph.getNeighbors(node);
            if (neighbors != null) {
                for (Node neighbor : neighbors) {
                    DFS(visited, graph, neighbor);
                }
            }
        }
    }
}







