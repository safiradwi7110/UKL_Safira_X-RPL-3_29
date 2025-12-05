

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal3;

import java.util.Scanner;

/**
 *
 * @author Safira
 */
public class UKLSoal3 {  

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Bilangan Bulat: ");
        int n = input.nextInt();
        
        long faktorial = + 1;
        for (int i = n; i >= 1; i--){     
        faktorial *= i;
        System.out.print(i);
       if(i>1){
           System.out.print("*");
       }
    }       
            System.out.println(" = "+faktorial);
        }
          
        }
    
    