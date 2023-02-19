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
public class Practice2 {
    public static void main(String[] args){
        //membuat variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        //mengambil input
        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine();
        
        switch (lampu){
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }
    }
}
