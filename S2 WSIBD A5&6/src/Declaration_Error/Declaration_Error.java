/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Declaration_Error;

/**
 *
 * @author aryas
 */
public class Declaration_Error {
    public static void main(String[] args){
        boolean gameOver = false; //tidak ada kesalahan dalam pendeklarasian variable
        int students=50,classes=3; //tidak ada kesalahan dalam pendeklarasian variable
        double sales_tax; //tidak ada kesalahan dalam pendeklarasian variable
        short number1; //tidak ada kesalahan dalam pendeklarasian variable

        int 2beOrNot2be; /* terjadi kesalahan pada pendeklarasian variable tersebut, karena 
                            nama variabel tersebut berawalan angka*/
        float price index; /* terjadi kesalahan pada pendeklarasian variable tersebut, karena 
                              pada penamaan variabel tidak boleh menggunakan spasi*/
        double lastYear'sPrice; 
                            /* terjadi kesalahan pada pendeklarasian variable tersebut, karena 
                            pada penamaan variabel tidak boleh menggunakan spasi*/
        long class; /* terjadi kesalahan pada pendeklarasian variable tersebut, karena class 
                       merupakan reserved word atau keyword java yang telah tertanam di dalam program java */
    }
}
