/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.Belanja;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Struk {
    String idStruk, tanggal, namaBarang;
    int jumlah, total;

    Struk(String id, String tgl, String nb, int jml, int n){
        idStruk = id;
        tanggal = tgl;
        namaBarang = nb;
        jumlah = jml;
        total = n;
    }
}
