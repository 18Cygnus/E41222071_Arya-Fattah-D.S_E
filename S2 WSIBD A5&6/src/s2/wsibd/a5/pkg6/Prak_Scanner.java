/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s2.wsibd.a5.pkg6;
import java.util.Scanner;
/**
 *
 * @author aryas
 */
public class Prak_Scanner {
    public static void main(String[] args) {
    //Buat Scanner
        Scanner sl = new Scanner(System.in);
    //Ambil nilai dari keyboard    
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = sl.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = sl.nextInt();
    //Hitung dan Print
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
}
