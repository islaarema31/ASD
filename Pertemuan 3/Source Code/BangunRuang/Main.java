/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.BangunRuang;
import java.util.Scanner;
/**
 *
 * @author Muhammad Islahuddin
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner br = new Scanner(System.in);
        
        System.out.println("Masukan jumlah bangun ruang : ");
        int input = br.nextInt();
        
        Balok[] blk = new Balok[input];
        Kubus[] kbs = new Kubus[input];
        Bola[] bol = new Bola[input];
        
        for (int i = 0; i < input; i++) {
            System.out.println("Masukkan Panjang Balok ke- " + (i+1) + "-> ");
            int p = br.nextInt();
            System.out.println("Masukkan Panjang Lebar ke- " + (i+1) + "-> ");
            int l = br.nextInt();
            System.out.println("Masukkan Panjang Tinggi ke- " + (i+1) + "-> ");
            int t = br.nextInt();
            blk[i] = new Balok(p, l, t);
        }
        
        for (int i = 0; i < input; i++) {
            System.out.println("Luas Permukaan Balok ke- " + (i+1) + "-> " + blk[i].LuasBalok());
            System.out.println("Volume Balok ke- " + (i+1) + "-> " + blk[i].VolumeBalok());
        }
        
        for (int i = 0; i < input; i++) {
            System.out.println("Masukkan Sisi Kubus ke- " + (i+1) + "-> ");
            int s = br.nextInt();
            kbs[i] = new Kubus(s);
        }
        
        for (int i = 0; i < input; i++) {
            System.out.println("Luas Permukaan Kubus ke- " + (i+1) + "-> " +  kbs[i].LuasKubus());
            System.out.println("Volume Kubus ke- " + (i+1) + "-> " + kbs[i].VolumeKubus());
        }
        
        for (int i = 0; i < input; i++) {
            System.out.println("Masukkan Jari-jari Bola ke- " + (i+1) + "-> ");
            double r = br.nextDouble();
            bol[i] = new Bola(r);
        }
        
        for (int i = 0; i < input; i++) {
            System.out.println("Luas Permukaan Bola ke- " + (i+1) + "-> " +  bol[i].LuasBola());
            System.out.println("Volume Bola ke- " + (i+1) + "->" + bol[i].VolumeBola());
        }
    }
}
