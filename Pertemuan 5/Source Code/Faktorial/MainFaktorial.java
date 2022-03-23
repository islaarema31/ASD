/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.Faktorial;

import java.util.Scanner;

/**
 *
 * @author Muhammad Islahuddin
 */
public class MainFaktorial {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        Faktorial [] fk = new Faktorial[elemen];
        
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke- " + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        
        System.out.println("==============================================");
            System.out.println("Hasil faktorial dengan Brute Force : ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].FaktorialBF(fk[i].nilai));
        }
        long time = System.currentTimeMillis();
        long elapsedtime = time - start;
        System.out.println("Waktu " + String.valueOf(elapsedtime) + "ms");
        long start1 = System.currentTimeMillis();
        
        System.out.println("==============================================");
            System.out.println("Hasil faktorial dengan Divide Conqueror : ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].FaktorialDC(fk[i].nilai));        
    }
        long time1 = System.currentTimeMillis();
        long elapsedtime1 = time1 - start1;
        System.out.println("Waktu " + String.valueOf(elapsedtime1) + "ms");
        System.out.println("=================================================");          
    }  
    
}
