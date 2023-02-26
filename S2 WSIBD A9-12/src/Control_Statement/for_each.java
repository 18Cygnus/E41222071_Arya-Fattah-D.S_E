/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Statement;

/**
 *
 * @author aryas
 */
public class for_each {
    public static void main(String[] args) {
        //membaut array
        int angka[] = {3,1,42,24,12};
        //menggunakan perulangan For each untuk menampilkan angka
        for (int x : angka){
            System.out.print(x+" ");
        }
    }
}
