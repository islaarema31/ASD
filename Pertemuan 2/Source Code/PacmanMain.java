/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import java.util.Scanner;
/**
 *
 * @author Muhammad Islahuddin
 */
public class PacmanMain {
    public static void main(String[] args) {
        Pacman p = new Pacman();
        Scanner sc = new Scanner(System.in);
        p.x = 0;
        p.y = 0;

        System.out.print("Masukkan batasan arena x = ");
        p.width = sc.nextInt();
        System.out.print("Masukkan batasan arena y = ");
        p.height = sc.nextInt();

        for (;;) {
            System.out.print(
                    "\nPilih Arah : \nKiri Tekan -> 1\nKanan Tekan -> 2\nAtas Tekan -> 3\nBawah Tekan -> 4\nExit tekan -> 5\nJawaban anda = ");
            int input = sc.nextInt();
            if (p.x == 0 && input == 1) {
                System.out.println("\nPacman Keluar Arena");
                p.printPosition(p.x, p.y);
                continue;
            } else if (p.y == 0 && input == 4) {
                System.out.println("\nPacman Keluar Arena");
                p.printPosition(p.x, p.y);
                continue;
            } else if (p.x == p.width && input == 2) {
                System.out.println("\nPacman Keluar Arena");
                p.printPosition(p.x, p.y);
                continue;
            } else if (p.y == p.height && input == 3) {
                System.out.println("\nPacman Keluar Arena");
                p.printPosition(p.x, p.y);
                continue;
            }

            if (input == 1) {
                p.moveLeft(p.x);
                p.printPosition(p.x, p.y);
            } else if (input == 2) {
                p.moveRight(p.x);
                p.printPosition(p.x, p.y);
            } else if (input == 3) {
                p.moveUp(p.y);
                p.printPosition(p.x, p.y);
            } else if (input == 4) {
                p.moveDown(p.y);
                p.printPosition(p.x, p.y);
            } else{
                System.out.println("\nInput Salah atau Anda Sudah Keluar\n");
                break;
            }

        }

    }
}
