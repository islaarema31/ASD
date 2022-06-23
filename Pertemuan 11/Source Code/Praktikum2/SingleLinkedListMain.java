/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11.Praktikum2;

/**
 *
 * @author Muhammad Islahuddin
 */
public class SingleLinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList singL = new SingleLinkedList();
        
        singL.print();
        singL.addFirst(890);
        singL.print();
        singL.addLast(760);
        singL.print();
        singL.addFirst(700);
        singL.print();
        singL.insertAfter(700, 999);
        singL.print();
        singL.insertAt(3, 833);
        singL.print();
        
        System.out.println("\nData pada index ke-1\t\t: "+singL.getData(1));
        System.out.println("Data 3 berada pada indeks ke\t: "+singL.indexOf(760)+"\n");
        
        singL.remove(999);
        singL.print();
        singL.removeAt(0);
        singL.print();
        singL.removeFirst();
        singL.print();
        singL.removeLast();
        singL.print();
    }
}
