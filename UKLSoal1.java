/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal1;

import java.util.Scanner;

/**
 *
 * @author Safira
 */
public class UKLSoal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka");
        int e = input.nextInt();

        // Meminta jumlah elemen
        System.out.print("Masukkan jumlah elemen Fibonacci: ");
        int n = input.nextInt();
                
        // Jika input kurang dari 1
        if (n <= 0) {
            System.out.println("Jumlah elemen harus lebih dari 0.");
            return;
        }

        int a = e, b = 1;     // dua elemen awal Fibonacci
        int genap = 0, ganjil = 0;

        System.out.println("\nDeret Fibonacci:");
        
               
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            

            // Menghitung ganjil/genap
            if (a % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            // Menggeser nilai Fibonacci
            int c = a + b;
            a = b;
            b = c;
        }

        // Hasil akhir
        System.out.println("\n\nJumlah bilangan genap: " + genap);
        System.out.println("Jumlah bilangan ganjil: " + ganjil);

        input.close();
    }
}
