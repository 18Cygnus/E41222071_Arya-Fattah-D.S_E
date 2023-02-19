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
public class Cafe {
    public static void main(String[] args){
        String line = new String(new char[22]).replace('\0', '-');
        Scanner scan = new Scanner(System.in);
        String[] menu = {"Soft drinks", "Mix juice", "Nescafe", "Soda milk", "Tea"};
        String name;
        int list;
        
        System.out.println("      CAFE CERIA");
        System.out.println("    ANEKA MINUMAN");
        System.out.println(line);
        System.out.println("    SPECIAL MENU :");
        for(int i=0; i<menu.length; i++){
            System.out.println("  "+(i+1)+". "+menu[i]);
        }
        System.out.println(line);
        
        System.out.print("Masukkan nama pembeli : ");
        name = scan.nextLine();
        System.out.println("");
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        list = scan.nextInt();
        
        switch (list){
            case 1:
               System.out.println("Minuman yang anda pesan adalah "+menu[list-1]);
               System.out.println("Pesanan akan segera kami antar");
               System.out.println("Terima kasih "+ name + " telah berkunjung di Cafe Ceria");
               break;
            case 2:
               System.out.println("Minuman yang anda pesan adalah "+menu[list-1]);
               System.out.println("Pesanan akan segera kami antar");
               System.out.println("Terima kasih "+ name + " telah berkunjung di Cafe Ceria");
               break;
            case 3:
               System.out.println("Minuman yang anda pesan adalah "+menu[list-1]);
               System.out.println("Pesanan akan segera kami antar");
               System.out.println("Terima kasih "+ name + " telah berkunjung di Cafe Ceria");
               break;
            case 4:
               System.out.println("Minuman yang anda pesan adalah "+menu[list-1]);
               System.out.println("Pesanan akan segera kami antar");
               System.out.println("Terima kasih "+ name + " telah berkunjung di Cafe Ceria");
               break;
            case 5:
               System.out.println("Minuman yang anda pesan adalah "+menu[list-1]);
               System.out.println("Pesanan akan segera kami antar");
               System.out.println("Terima kasih "+ name + " telah berkunjung di Cafe Ceria");
               break;
            default:
                System.out.println("Masukkan pilihan berupa nomor yang ada pada menu!");
                
        }
    }
}
