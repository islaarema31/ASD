/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.Stack;

import java.util.Scanner;

/**
 *
 * @author Muhammad Islahuddin
 */
public class StackMain {
        public static void menu(){
        System.out.println("Silahkan pilih aksi yang anda inginkan : ");
        System.out.println("1. Push ");
        System.out.println("2. Print ");
        System.out.println("3. Pop ");
        System.out.println("4. Peek ");
        System.out.println("5. Pakaian termurah ");
        System.out.println("-----------------------");
        }
    public static void main(String[] args){
        Stack stk = new Stack(5);
        Scanner sc = new Scanner(System.in);

        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih){
                case 1:
                    System.out.println("Masukkan data pakaian ");
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                    sc.nextLine();
                    stk.push(p);
                    break;
                case 2:
                    stk.print();
                    break;
                case 3:
                    stk.pop();
                    break;
                case 4:
                    stk.peek();
                    break;
                case 5:
                    stk.getMin();
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
