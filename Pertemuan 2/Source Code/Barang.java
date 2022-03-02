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
public class Barang {
    /*String namaBarang, jenisBarang;
    int stok, hargaSatuan;
    
    void tampilBarang(){
        System.out.println("Nama    : "+namaBarang);
        System.out.println("Jenis   : "+jenisBarang);
        System.out.println("Srok    : "+stok);
        System.out.println("Harga Satuan    : "+hargaSatuan);
    }
    
    void tambahStok(int n){
    stok = stok+n;
}
    
    void kurangiStok(int n){
        stok = stok-n;
    }
    
    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    } */
    
    String nama;
    int hargaSatuan;
    int jumlah;

    int hargaTotal(int p, int j) {
        int hartot;
        hartot=p*j;
        return hartot;
    }

    double diskon(int a) {
        double hargaDiskon=0;
        if (a>100000){
            hargaDiskon=a*0.10;
        } else if (a>=50000&&a<=100000){
            hargaDiskon=a*0.05;
        }else {
            hargaDiskon=0;
        }
        return hargaDiskon;
    }

    double hargaBayar(int x, double z) {
        double hargaBayar=0;
        hargaBayar=x-z;
        return hargaBayar;
    }
}
