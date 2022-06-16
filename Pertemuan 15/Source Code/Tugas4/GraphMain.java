/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan15.Tugas4;

import java.util.Scanner;

/**
 *
 * @author Muhammad Islahuddin
 */
public class GraphMain {
        public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph(6);
        graph.addEdge(0, 1, "Surabaya", "Malang");
        graph.addEdge(0, 4, "Surabaya", "Batu");
        graph.addEdge(1, 2, "Malang", "Batu");
        graph.addEdge(1, 3, "Malang", "Blitar");
        graph.addEdge(1, 4, "Malang", "Surabaya");
        graph.addEdge(2, 3, "Batu", "Malang");
        graph.addEdge(3, 4, "Blitar", "Surabaya");
        graph.addEdge(3, 0, "Blitar", "Batu");
        graph.printGraph();
        graph.degree(2);
        graph.printGraph();
    }
}
