/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.BangunRuang;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Balok {
    public int panjang, lebar, tinggi;
    
    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    public int LuasBalok(){
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
    public int VolumeBalok(){
        return panjang*lebar*tinggi;
    }
}
