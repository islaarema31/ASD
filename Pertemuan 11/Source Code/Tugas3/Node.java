/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11.Tugas3;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Node {
    String data;
    Node next;
    
    public Node(String nilai, Node berikutnya){
        this.data = nilai;
        this.next = berikutnya;
    }
}
