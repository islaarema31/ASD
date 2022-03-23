/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.Sum;

import java.util.Scanner;

/**
 *
 * @author Muhammad Islahuddin
 */
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int el = 0;
        System.out.println("====================================================");
        System.out.println("Program menghitung keuntungan total");
        System.out.println("Masukkan jumlah perusahaan : ");
        int jmlh_prs = sc.nextInt();
        for (int i = 0; i < jmlh_prs; i++) {
            System.out.println("Masukkan jumlah bulan perusahaan ke-  " + (1 + i) + " : ");
            int elm = sc.nextInt();
            el = elm;
        }
        
        Sum sm = new Sum(el, jmlh_prs);
        System.out.println("====================================================");
        
        for (int i = 0; i < jmlh_prs; i++) {
            System.out.println("Perusahaan ke- " + (i+1));
            for (int j = 0; j < el; j++) {
                System.out.println("Masukkan untung bulan ke- " + (i+1) + " : ");
                sm.keuntungan[j] = sc.nextDouble(); 
            }
        }
        
        for (int i = 0; i < jmlh_prs; i++) {
        System.out.println("Perusahaan ke- " + (i+1));
        System.out.println("====================================================");
        System.out.println("Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen[i] + " bulan : " + sm.totalBF(sm.keuntungan));
        System.out.println("====================================================");
        System.out.println("Devide Conque");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen[i] + " bulan : " + sm.totalDC(sm.keuntungan, 0, sm.elemen[i]-1));
       }
    }
    }

