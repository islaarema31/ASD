/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11.Praktikum1;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Node {
    int data;
    Node next;
    
    public Node(int nilai, Node berikutnya){
        this.data = nilai;
        this.next = berikutnya;
    }
}
