/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belanja;

import java.util.Scanner;

/**
 *
 * @author SULTHAN
 */

public class Belanja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int br1,br2,br3,br4,br5,total;
        String nama; //Akbar Ramadhani Firdaus
        System.out.println("------------------------------------------------------");
        System.out.println("            Kharisma Agung Plaza < KAP >            ");
        System.out.println("              Promo Belanja Berhadiah             ");
        System.out.println("          Khusus Pembelian 5 Barang Pertama       ");
        System.out.println("          Dengan Harga Minimum Rp 10000,00");
        System.out.println("------------------------------------------------------");
        System.out.print("Masukkan Nama Pembeli : ");
        nama = input.nextLine();
        System.out.print("\nMasukkan Harga Barang ke-1   : ");
        br1 = input.nextInt();
        System.out.print("Masukkan Harga Barang ke-2   : ");
        br2 = input.nextInt();
        System.out.print("Masukkan Harga Barang ke-3   : ");
        br3 = input.nextInt();
        System.out.print("Masukkan Harga Barang ke-4   : ");
        br4 = input.nextInt();
        System.out.print("Masukkan Harga Barang ke-5   : ");
        br5 = input.nextInt();
        total = br1+br2+br3+br4+br5;
        System.out.println("Total Harga Pembelian Atas Nama "+ nama +" adalah Rp " + total + "\n");
        System.out.println("Selamat...");
        System.out.println("Anda Mendapat Hadiah 1 Buah Mug Cantik");
        System.out.println("------------------------------------------------------");
        System.out.println("                        Terima Kasih                    ");
        System.out.println("        Anda Sudah Belanja Di Kharisma Agung Plaza    ");
    }
    
}
