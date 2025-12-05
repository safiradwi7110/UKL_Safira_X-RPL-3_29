/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalukl4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Safira
 */
public class SoalUKL4 {

    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int angkaBenar = rand.nextInt(100) + 1; // angka 1-100
        ArrayList<Integer> riwayatTebakan = new ArrayList<>();

        System.out.println("=== PERMAINAN TEBAK ANGKA ===");
        System.out.println("Komputer telah memilih angka 1 - 100");
        System.out.println("Silakan tebak!");

        while (true) {
            System.out.print("Masukkan tebakan anda: ");
            int tebakan = input.nextInt();

            // Simpan tebakan ke arraylist
            riwayatTebakan.add(tebakan);

            // Cek
            if (tebakan > angkaBenar) {
                System.out.println("Tebakan terlalu tinggi!");
            } else if (tebakan < angkaBenar) {
                System.out.println("Tebakan terlalu rendah!");
            } else {
                System.out.println("Anda menebak dengan benar!!!");
                break; // keluar loop
            }
        }

        // Menampilkan riwayat tebakan
        System.out.println("\n=== Riwayat Tebakan Anda ===");
        for (int i = 0; i < riwayatTebakan.size(); i++) {
            System.out.println("Tebakan ke-" + (i+1) + ": " + riwayatTebakan.get(i));
        }
        System.out.println("Anda menebak sebanyak : " + riwayatTebakan.size() + " kali ");

        input.close();
    }
}
    

