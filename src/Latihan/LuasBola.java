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
public class LuasBola {
    public static void main(String[] args){
        Double phi, r, luasbola;
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("phi :");
        phi = masukan.nextDouble();
        
        System.out.print("r : ");
        r = masukan.nextDouble();
        
        luasbola = 4*+phi*+r;
        System.out.println("Luas permukaan bola = "+ luasbola);
    } 
}
