/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.Latihan;

import java.util.Scanner;

/**
 *
 * @author Muhammad Islahuddin
 */
public class LatihanMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Banyak Suara : ");
        int suara = input.nextInt();
        Latihan test = new Latihan(suara);
        input.nextLine();
        for(int i = 0; i < suara; i++){
            System.out.println("Masukkan Nama/Suara ke - "+ (i+1) + " = ");
            test.kandidat[i] = input.nextLine();
        }
        int hasil = test.ModusArray(test.kandidat, 0, suara, 0);
        System.out.println(" Mayoritaas Jumlah Suara adalah : " + test.kandidat[hasil]);
    }
}
