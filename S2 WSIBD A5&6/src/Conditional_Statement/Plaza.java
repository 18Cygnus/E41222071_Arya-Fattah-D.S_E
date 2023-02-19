/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conditional_Statement;
import java.util.Scanner;
/**
 *
 * @author aryas
 */
public class Plaza {
    public static void main(String[] args){
        
        String customerName;
        Scanner scan = new Scanner(System.in);
        int[] barang = new int[5];
        int total = 0;
        
        String line = new String(new char[55]).replace('\0', '-');
        System.out.println(line);
        System.out.println("            Kharisma Agung Plaza < KAP >           ");
        System.out.println("              Promo Belanja Berhadiah              ");
        System.out.println("         Khusus Pembelian 5 Barang Pertama         ");
        System.out.println("          Dengan Harga Minimum Rp. 10000           ");
        System.out.println(line);
        System.out.print("Masukkan nama pembeli : ");
        customerName = scan.nextLine();
        System.out.println();
        
        for (int i=0; i<barang.length; i++){
            System.out.print("Masukkan harga barang ke-"+(i+1)+" : ");
            barang[i] = scan.nextInt();
            total = total+barang[i];
        }
        System.out.println("Total harga pembelian atas nama "+customerName+" adalah Rp "+total);
        System.out.println();
        
        boolean promo = false;
        for (int i=0; i<barang.length; i++){
            promo = barang[i]>=10000;
        }
        if(promo==true){
            System.out.println("Selamat...");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
            System.out.println(line);
            System.out.println("                 Terimakasih                ");
            System.out.println(" Anda sudah belanja di Kharisma Agung Plaza ");
        }else{
            System.out.println(line);
            System.out.println("                 Terimakasih                ");
            System.out.println(" Anda sudah belanja di Kharisma Agung Plaza ");
        }
    }
}
