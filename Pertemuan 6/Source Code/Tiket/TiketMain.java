/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6.Tiket;

/**
 *
 * @author Muhammad Islahuddin
 */
public class TiketMain {
    public static void main(String[] args) {
        TiketService ts = new TiketService();
        Tiket t1 = new Tiket("Garuda Indonesia", 900000, "Malang" , "Jakarta");
        Tiket t2 = new Tiket("Batik Air", 800000, "Malang" , "Bandung");
        Tiket t3 = new Tiket("Sriwija Air", 650000, "Malang" , "Semarang");
        Tiket t4 = new Tiket("Citilink", 675000, "Malang" , "Solo");
        Tiket t5 = new Tiket("Lion Air", 680000, "Malang" , "Jogja");
        
        ts.tambah(t1);
        ts.tambah(t2);
        ts.tambah(t3);
        ts.tambah(t4);
        ts.tambah(t5);
        
        System.out.println("\nTiket sebelum sorting : \n");
        ts.tampilAll();
        
        System.out.println("\nTiket setelah disorting menggunakan bubblesort\n");
        ts.bubbleSort();
        ts.tampilAll();
        
        System.out.println("\nTiket setelah disorting menggunakan selection sort\n");
        ts.selectionSort();
        ts.tampilAll();
    }
}
