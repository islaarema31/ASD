/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author Muhammad Islahuddin
 */
public class BarangMain {
    public static void main(String[] args) {
        /**Barang b1 = new Barang();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(2);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(3);
        System.out.println("Harga 3 buah = "+hargaTotal);*/
        
        Barang b1 = new Barang();
        b1.nama = "HP";
        b1.hargaSatuan = 500000;
        b1.jumlah = 2;

        System.out.println("Harga total = " + b1.hargaTotal(b1.hargaSatuan, b1.jumlah));
        System.out.println("Diskon = " + b1.diskon(b1.hargaTotal(b1.hargaSatuan, b1.jumlah)));
        System.out.println("Harga bayar = " + b1.hargaBayar(b1.hargaTotal(b1.hargaSatuan, b1.jumlah),
        b1.diskon(b1.hargaTotal(b1.hargaSatuan, b1.jumlah))));
    }
        
    }

