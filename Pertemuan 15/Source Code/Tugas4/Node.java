/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan15.Tugas4;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Node {
    public String data;
    public Node prev;
    public Node next;

    public Node(Node prev, String data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
