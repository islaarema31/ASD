/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12.Tugas1;

import java.util.Scanner;

/**
 *
 * @author Muhammad Islahuddin
 */
public class DoubleLinkListMain {
    public static void menu() {
        System.out.println("\nPilih Menu:");
        System.out.println("1. Tambah data penerima vaksin");
        System.out.println("2. Hapus data penerima vaksin");
        System.out.println("3. Daftar penerima vaksin");
        System.out.println("4. Keluar");
        System.out.println("-------------------");
    }

    public static void main(String[] args) throws Exception {
        DoubleLinkList dll = new DoubleLinkList();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {

                case 1:
                    System.out.print("Nomor: ");
                    int nomor = sc.nextInt();
                    System.out.print("Nama: ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    dll.addLast(nomor, nama);
                    break;
                case 2:
                    System.out.println("\n" + dll.head.nama + " sudah selesai divaksinasi");
                    dll.removeFirst();
                    break;
                case 3:
                    System.out.println();
                    dll.print();
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}
