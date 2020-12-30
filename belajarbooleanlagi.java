/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

import java.util.Scanner;
/**
 *
 * @author ridooonya3
 */
public class belajarbooleanlagi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nm,prodi;
        double nim,hsl;
        int nilai1,nilai2,nilai3,a;
        boolean tot;
        
        System.out.println("=========================================");
        System.out.println("        HASIL NILAI ke-1 dan ke-2        "); 
        System.out.print("Masukkan Nama    : ");
        nm = input.nextLine();
        System.out.print("Masukkan Prodi   : ");
        prodi = input.nextLine();
        System.out.print("Masukkan NIM     : ");
        nim = input.nextDouble();
        System.out.print("nilai ke-1       : ");
        nilai1 = input.nextInt();
        System.out.print("nilai ke-2       : ");
        nilai2 = input.nextInt();
        System.out.print("nilai ke-3       : ");
        nilai3 = input.nextInt();
        tot = (nilai1+nilai2+nilai3)/3 >=80;
        hsl = ((nilai1+nilai2+nilai3)/3);
        System.out.println("Total Nilai "+nm+"      : "+hsl);
        System.out.println("KETETANGAN       : "+tot);
        System.out.println("===========================================");
        
        
    }
}
