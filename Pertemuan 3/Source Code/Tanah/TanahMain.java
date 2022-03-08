/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.Tanah;
import java.util.Scanner;
/**
 *
 * @author Muhammad Islahuddin
 */
public class TanahMain {
    public static void main(String[] args) {
        Scanner tn = new Scanner(System.in);
        System.out.println("Banyak bidang tanah yang akan dihitung : ");
        int hitung = tn.nextInt();
        System.out.println();
        Tanah[] tnh = new Tanah[hitung];
        
        for (int i = 0; i < tnh.length; i++) {
            System.out.println("Masukkan panjang bidang tanah ke- " + (i+1) + "-> ");
            int p = tn.nextInt();
            System.out.println("Masukkan lebar bidang tanah ke- " + (i+1) + "-> ");
            int l = tn.nextInt();
            tnh[i] = new Tanah(p, l);
        }
        
        int a = 0;
        int b = 0;
        for (int i = 0; i < tnh.length; i++) {
            if (tnh[i].LuasTanah()>a) {
                a = tnh[i].LuasTanah();
                b = i+1;
            }
        }
        for (int i = 0; i < tnh.length; i++) {
            System.out.println("Luas bidang tanah ke- " + (i+1) + "-> " + tnh[i].LuasTanah());
        }
        System.out.println("Bidang tanah terluas adalah bidang ke- " +b);
    }
}
