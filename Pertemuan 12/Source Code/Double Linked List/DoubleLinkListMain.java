/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12.Node;

/**
 *
 * @author Muhammad Islahuddin
 */
public class DoubleLinkListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkList dll = new DoubleLinkList();
       // dll.addLast(50);
       // dll.addLast(40);
       // dll.addLast(10);
       // dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==================================");
        dll.add(40, 1);
        //dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==================================");
        System.out.println("Data Awal Linked List adalah: " + dll.getFirst());
        System.out.println("Data Akhir Linked List adalah: " + dll.getLast());
        System.out.println("Data Indeks ke-1 pada Linked List adalah: " + dll.get(1));
        //dll.clear();
        //dll.remove(1);
        //dll.print();
        //System.out.println("Size : " + dll.size());
    }
}
