/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal6;

import java.util.Scanner;

/**
 *
 * @author Safira
 */
public class UKLSoal6 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan golongan listrik (A/B/C): ");
        char golongan = input.next().toUpperCase().charAt(0);

        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        int kwh = input.nextInt();

        int tarif = 0;
        double tambahanPersentase = 0;

        // Tentukan tarif berdasarkan golongan
        if (golongan == 'A') {
            tarif = 1200;
            tambahanPersentase = 0.10;
        } else if (golongan == 'B') {
            tarif = 1500;
            tambahanPersentase = 0.30;
        } else if (golongan == 'C') {
            tarif = 1800;
            tambahanPersentase = 0.50;
        } else {
            System.out.println("Golongan tidak valid!");
            return; // hentikan program
        }
        // Hitung tagihan awal
        double totalSebelum = kwh * tarif;
 
        // Hitung biaya tambahan jika > 500 kWh
        double tambahan  = 0;
        if (kwh > 500) {
            tambahan = totalSebelum * tambahanPersentase; // 10%
        }

        double totalAkhir = totalSebelum + tambahan;
        double biayaTambahan = totalAkhir - totalSebelum;

        // Output
        System.out.println("\n=== Rincian Tagihan Listrik ===");
        System.out.println("Nama Pelanggan     : " + nama);
        System.out.println("Golongan Listrik   : " + golongan);
        System.out.println("Pemakaian (kWh)    : " + kwh);
        System.out.println("Tagihan Sebelum    : Rp " + totalSebelum);
        System.out.println("Biaya Tambahan     : Rp" + biayaTambahan);
        System.out.println("Total Tagihan Akhir: Rp " + totalAkhir);


    }
}
