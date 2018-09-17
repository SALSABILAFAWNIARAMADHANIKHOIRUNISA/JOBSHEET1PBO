/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Tugas2 {
    public static void main(String[] args){
        //deklarasi variabel
       String nama, tempatlahir, jeniskelamin, alamat, motto;
       Double NIS, tanggalLahir;
       
       //membuat scanner baru
       Scanner keyboard = new Scanner(System.in);
       
       //Tampilkan output ke user 
       System.out.println("## DATA SISWA SMK TELKOM MALANG ###");
       System.out.print("Nama Siswa :");
       nama = keyboard.next();
       
       System.out.print("NIS :");
       NIS = keyboard.nextDouble();

       System.out.print("Tempat Lahir :");
       tempatlahir = keyboard.next();
       
       System.out.print("Tanggal Lahir :");
       tanggalLahir = keyboard.nextDouble();
       
       System.out.print("Jenis Kelamin :");
       jeniskelamin = keyboard.next();
       
       System.out.print("Alamat di Malang :");
       alamat = keyboard.next();
       
       System.out.print("Motto :");
       motto = keyboard.next();
      
       System.out.println("--------------------");
       System.out.println("Nama Siswa : " + nama);
       System.out.println("NIS : " + NIS);
       System.out.println("Tempat Lahir : " + tempatlahir);
       System.out.println("Tanggal Lahir : " + tanggalLahir);
       System.out.println("Jenis Kelamin : " + jeniskelamin);
       System.out.println("Alamat di Malang : " + alamat);
       System.out.println("Motto Hidup : " + motto);
      
       
   }
    
    
}
