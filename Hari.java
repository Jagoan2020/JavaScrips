/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

import java.util.Scanner;

/**
 *
 * @author Windows8
 */
public class Hari {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hari, bulan, tahun;
        hari = 0;
        bulan = 0;
        tahun = 0;
        
        System.out.println("Menghitung hari dalam satu bulan");
        System.out.println(" ");
        System.out.print("Masukkan Tahun: ");
        tahun = input.nextInt();
        System.out.print("Masukkan Bulan: ");
        bulan = input.nextInt();

        if (bulan > 12) {
            System.out.println("Tidak ada pilihan hari!!!!");
        } else {  
        }
        if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 9 || bulan == 11) {
            System.out.println("jumlah hari : 31 hari");
        } else if (bulan == 4 || bulan == 6 || bulan == 8 || bulan == 10 || bulan == 12) {
            System.out.println("jumlah hari: 30 hari");
        } else {

        }
        if (bulan == 2) {
            if ((tahun % 400 == 0) && !(tahun % 100 == 0) && !(bulan % 4 == 0)) {
                System.out.println("jumlah hari: 29 hari");
            } else {
                System.out.println("jumlah hari: 28 hari");
            }
        }
    }
}
