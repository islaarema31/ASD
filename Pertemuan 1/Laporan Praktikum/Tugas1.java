/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Tugas1 {
    public static void main(String[] args) {
        int ani =4,budi = 15, bina = 6, cita = 11;
        double total;
        System.out.println("Harga per Customer : ");
        System.out.println("Ani     Rp " +(4*4500));
        System.out.println("Budi    Rp " +(15*4500*0.05));
        System.out.println("Bina    Rp " +(6*4500));
        System.out.println("Cita    Rp " +(11*4500*0.05));
        
        total = ((4*4500)+(15*4500*0.05)+(6*4500)+(11*4500*0.05));
        System.out.println("Total Pendapatan Smile Laundry Per-Hari Adalah Rp. " +total);
    }
}
