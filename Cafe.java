/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belanja;

import java.util.Scanner;

/**
 *
 * @author Akbar Ramadhani Firdaus
 */
public class Cafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        String nama;
        System.out.println("      CAFE CERIA        ");
        System.out.println("    ANEKA MINUMAN   ");
        System.out.println("----------------------");
        System.out.println("    SPECIAL MENU :    ");
        System.out.println("    1. Soft Drinks      ");
        System.out.println("    2. Mix Juice      ");
        System.out.println("    3. Nescafe      ");
        System.out.println("    4. Soda Milk      ");
        System.out.println("    5. Tea      ");
        System.out.println("----------------------");
        System.out.print("Masukkan Nama Pembeli : ");
        nama = input.nextLine();
        System.out.print("\nSilahkan Masukkan Pilihan Anda : ");
        pil = input.nextInt();
        
        switch(pil){
            case 1:
                System.out.println("Minuman Yang Anda Pesan Adalah Soft Drinks");
                break;
            case 2:
                System.out.println("Minuman Yang Anda Pesan Adalah Mix Juice");
                break;
            case 3:
                System.out.println("Minuman Yang Anda Pesan Adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman Yang Anda Pesan Adalah Soda Milk");
                break;
            case 5:
                System.out.println("Minuman Yang Anda Pesan Adalah Tea");
                break;
            default:
                System.out.println("Pilihan Menu Yang Anda Pilih Tidak Ada");
    }
        System.out.println("Pesanan Akan Segera Kami Antar");
        System.out.println("Terima Kasih " + nama + " Telah Berkunjung Di CAFE CERIA");
        
    }
}
