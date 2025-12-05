/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal7;

import java.util.Scanner;

/**
 *
 * @author Safira
 */
public class UKLSoal7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah paket photobooth: ");
        int n = input.nextInt();
        input.nextLine(); // membersihkan enter

        String[] nama = new String[n];
        long[] biayaProduksi = new long[n];
        long[] hargaJual = new long[n];
        int[] jumlahEvent = new int[n];

        long[] totalBiaya = new long[n];
        long[] totalPendapatan = new long[n];
        long[] labaRugi = new long[n];
        String[] status = new String[n];

        long totalKeseluruhan = 0;
        long labaTertinggi = Long.MIN_VALUE;
        String paketTerbaik = "";

        // Input data setiap paket
        for (int i = 0; i < n; i++) {
            System.out.println("\n=== Data Paket ke-" + (i + 1) + " ===");

            System.out.print("Nama Paket: ");
            nama[i] = input.nextLine();

            System.out.print("Biaya Produksi per Event: ");
            biayaProduksi[i] = input.nextLong();

            System.out.print("Harga Jual per Event: ");
            hargaJual[i] = input.nextLong();

            System.out.print("Jumlah Event Terjual: ");
            jumlahEvent[i] = input.nextInt();
            input.nextLine(); // agar tidak error nextLine

            // Perhitungan
            totalBiaya[i] = biayaProduksi[i] * jumlahEvent[i];
            totalPendapatan[i] = hargaJual[i] * jumlahEvent[i];
            labaRugi[i] = totalPendapatan[i] - totalBiaya[i];
            totalKeseluruhan += labaRugi[i];

            if (labaRugi[i] > 0) status[i] = "Laba";
            else if (labaRugi[i] < 0) status[i] = "Rugi";
            else status[i] = "Impas";

            // Mencari paket dengan laba tertinggi
            if (labaRugi[i] > labaTertinggi) {
                labaTertinggi = labaRugi[i];
                paketTerbaik = nama[i];
            }
        }

        // Output tabel
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("Nama Paket | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%s | Rp%,d | Rp%,d | Rp%,d | %s\n",
                    nama[i], totalBiaya[i], totalPendapatan[i], labaRugi[i], status[i]);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("Total Laba/Rugi Keseluruhan: Rp%,d\n", totalKeseluruhan);
        System.out.printf("Paket dengan Laba Tertinggi: %s (Rp%,d)\n", paketTerbaik, labaTertinggi);

        input.close();
    }
}
 