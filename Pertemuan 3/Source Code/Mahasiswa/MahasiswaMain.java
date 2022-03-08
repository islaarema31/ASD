/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.Mahasiswa;

import java.util.Scanner;

/**
 *
 * @author Muhammad Islahuddin
 */
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] mhs = new Mahasiswa[3];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
        }
        
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke- " +(i+1)+ "->");
            System.out.println("Nama            : ");
            mhs[i].nama = sc.nextLine();
            System.out.println("NIM             : ");
            mhs[i].nim = sc.nextInt();
            sc.nextLine();
            System.out.println("Jenis Kelamin   : ");
            mhs[i].jnsKelamin = sc.nextLine();
            System.out.println("IPK             : ");
            mhs[i].ipk = sc.nextDouble();
            sc.nextLine();
        }
        
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahsiswa ke- " + (i+1) + " adalah ");
            System.out.println("Nama                    : " + mhs[i].nama);
            System.out.println("NIM                     : " + mhs[i].nim);
            System.out.println("Jenis Kelamin           : " + mhs[i].jnsKelamin);
            System.out.println("IPK                     : " + mhs[i].ipk);
        }
    }
}
