/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7.Tugas3;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Tugas3Main {
        public static void main(String[] args) {
        int bil[] = {12,17, 2, 1, 70, 50, 90, 17, 2, 90};
        
        Tugas3 arry = new Tugas3 (bil);
        
        int jum = 10;
        int maks = 0;
        
        System.out.println("------------------------------------------------");
        System.out.println("tampil data sebelum disorting adalah");
        arry.tampil();
        arry.bubbleSort();
        System.out.println("--------------------------------------------------");
        System.out.println("tampil data setelah dishorting dengan bubble short");
        arry.tampil();
        System.out.println("___________________________________________________");
        arry.nilaiTerbesar();
        arry.searching(maks, 0, jum-1);
        arry.tampilPosisi(maks);
    }
}
