/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12.Tugas1;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Node {
    int nomor;
    String nama;
    Node prev, next;

    Node(Node prev, int nomor, String nama, Node next) {
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
