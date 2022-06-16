/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan15.Tugas1;

import java.util.Scanner;

/**
 *
 * @author Muhammad Islahuddin
 */
public class GraphMain {
        public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int vertextotal, x, y;
        System.out.println("Masukkan berpaa banyak vertex : ");
        vertextotal = sc.nextInt();
        Graph graph = new Graph(vertextotal);
        System.out.println("Masukkan <source> <destination>");
        int i = 0;
        while (i <= vertextotal){
            x = sc.nextInt();
            y = sc.nextInt();

            graph.addEdge(x, y);
            i++;
        }
        x = sc.nextInt();
        y = sc.nextInt();
        graph.addEdge(x, y);

        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();
    }
}
