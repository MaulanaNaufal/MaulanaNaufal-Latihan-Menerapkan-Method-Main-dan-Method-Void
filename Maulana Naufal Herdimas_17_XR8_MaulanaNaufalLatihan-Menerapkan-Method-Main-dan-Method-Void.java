/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Methodvoid {
    
    String nama, makanan;
    
    public static void main(String[] args){
        
        Methodvoid Hewan = new Methodvoid();
        System.out.println("<=====Kucing=====>");
        Hewan.Kucing();
        System.out.println("<=====Anjing=====>");
        Hewan.Anjing();
    }
    
    void Kucing(){
        nama = "Miuw";
        makanan = "Wishkas";
        System.out.println("Nama Kucingku Adalah = "+nama);
        System.out.println("Kucingku Suka Makan = "+makanan);
    }
    
    void Anjing(){
        nama = "Gukguk";
        makanan = "Daging";
        System.out.println("Nama Anjingku Adalah "+nama);
        System.out.println("Anjingku Suka Makan "+makanan);
    }
}

