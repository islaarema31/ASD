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
public class SingleLinkedListMain {
        public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        
        sl.print();
        sl.addFirst(890);
        sl.print();
        sl.addLast(760);
        sl.print();
        sl.addFirst(700);
        sl.print();
        sl.insertAfter(700, 999);
        sl.print();
        sl.insertAt(3, 833);
        sl.print();
    }
}
