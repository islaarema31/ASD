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
public class Tiket {
    String maskapai, asal, tujuan;
    int harga;

    public Tiket(String m, int h, String a, String t) {
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    
    void tampil(){
        System.out.println("Maskapai = " + maskapai);
        System.out.println("Harga = " + harga);
        System.out.println("Asal = " + asal);
        System.out.println("Tujuan = " + tujuan);
    }
}
