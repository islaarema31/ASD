/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;
import java.util.Scanner;
/**
 *
 * @author Muhammad Islahuddin
 */
public class Pemilihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Input Nilai Tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Input Nilai UTS : ");
        int uts = sc.nextInt();
        System.out.print("Input Nilai UAS : ");
        int uas = sc.nextInt();
        float nilaiAkhir;
        String nilaiHuruf;
        nilaiAkhir = (float)((0.2*tugas)+(0.35*uts)+(0.45*uas));
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        if (nilaiAkhir>80 && nilaiAkhir<=100) {
            nilaiHuruf ="A";
            System.out.println("Nilai Huruf " +nilaiHuruf);
        } else if (nilaiAkhir>73 && nilaiAkhir<=80) {
            nilaiHuruf ="B+";
            System.out.println("Nilai Huruf " +nilaiHuruf);
        }else if (nilaiAkhir>65 && nilaiAkhir<=73){
            nilaiHuruf ="B";
            System.out.println("Nilai Huruf " +nilaiHuruf);    
        }else if (nilaiAkhir>60 && nilaiAkhir<=65){
            nilaiHuruf ="C+";
            System.out.println("Nilai Huruf " +nilaiHuruf);
        }else if (nilaiAkhir>50 && nilaiAkhir<=60){
            nilaiHuruf ="C";
            System.out.println("Nilai Huruf " +nilaiHuruf);
        }else if (nilaiAkhir>39 && nilaiAkhir<=50){
            nilaiHuruf ="D";
            System.out.println("Nilai Huruf " +nilaiHuruf);
        }else{
            nilaiHuruf ="E";
            System.out.println("Nilai Huruf " +nilaiHuruf);
        }
        System.out.println("============");
        if (nilaiHuruf.equals ("D") || nilaiHuruf.equals("E")) {
            System.out.println("Tidak Lulus");
        }else{
            System.out.println("Lulus");
        }
}
}
