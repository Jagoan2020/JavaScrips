/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

import java.util.Scanner;

/**
 *
 * @author Windows 10 Pro
 */
public class parkiranmall {

    public static void main(String[] args) {
        double tarifa, tarif, masuk, keluar, bayar, kembali, durasi;
        String plat;
        tarifa = 3000;
        Scanner input = new Scanner(System.in);

        System.out.print("Plat Nomor Kendaraan = ");
        plat = input.nextLine();

        System.out.print("Jam Datang           = ");
        masuk = input.nextDouble();

        System.out.print("Jam Keluar           = ");
        keluar = input.nextDouble();

        System.out.println("===========================");
        System.out.println("Plat Kendaraan =" + plat);
        durasi = keluar - masuk;
        System.out.println("Total Jam Parkir           = " + durasi);
        tarif = tarifa * durasi;
        System.out.println("Total Harga                = " + tarif);

        System.out.print("Uang Bayar                 = ");
        bayar = input.nextDouble();
        kembali = bayar - tarif;
        System.out.println("Uang Kembalian             = " + kembali);

    }

}
