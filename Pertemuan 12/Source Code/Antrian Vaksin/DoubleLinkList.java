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
public class DoubleLinkList {
    Node head;
    int size;

    public DoubleLinkList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nomor, String nama) {
        if (isEmpty()) {
            head = new Node(null, nomor, nama, null);
        } else {
            Node newNode = new Node(null, nomor, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int nomor, String nama) {
        if (isEmpty()) {
            addFirst(nomor, nama);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nomor, nama, null);
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.nomor + " - " + tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("\nSisa antiran : " + size);
        } else {
            System.out.println("Linked Lists kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
}
