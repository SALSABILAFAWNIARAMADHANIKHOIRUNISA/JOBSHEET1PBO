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
public class Tugas1 {
    public static void main(String[] args){
        Double suhu, Reamur, Fahrenheit, Kelvin;
        Scanner masukkan = new Scanner(System.in);
        
        System.out.print("Masukkan Suhu Celcius ke Reamur : ");
        suhu = masukkan.nextDouble();
        Reamur = suhu*4/5 ;
        
        System.out.print("Masukkan Suhu Celcius ke Fahrenheit : ");
        suhu = masukkan.nextDouble();
        Fahrenheit = suhu*9/5+32 ;
        
        System.out.print("Masukkan Suhu Celcius ke Reamur : ");
        suhu = masukkan.nextDouble();
        Kelvin = suhu*4/5+273 ; 
        
        System.out.println("Celcius ke Reamur : " + Reamur );
        System.out.println("Celcius ke Fahrenheit : " + Fahrenheit);
        System.out.println("Celcius ke Kelvin : " + Kelvin);
    }
}
