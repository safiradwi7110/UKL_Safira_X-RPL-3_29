/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal2;

import java.util.Scanner;

/**
 *
 * @author Safira
 */
public class UKLSoal2 {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Masukkan Angka Mulai");
        int n = r.nextInt();
        System.out.println("Masukkan Angka Akhir");
        int a = r.nextInt();
        for (int i = n; i >= a ; i--) {
            if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 34");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak moklet");
            } else {
                System.out.println(i + ". saya anak wikusama");
            }
        } 
        r.close();
    }   
}