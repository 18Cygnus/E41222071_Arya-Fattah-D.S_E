/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Statement.Tugas;
import java.util.Scanner;
/**
 *
 * @author aryas
 */
public class Bilangan_Genap_Kecil_ke_Besar {
    public static void main(String[] args) {
        // TODO code application logic here
         int arLength, temp;
        Scanner number = new Scanner(System.in);

        //tentukan panjang array
        System.out.print("Masukkan panjang data yang ingin di inputkan : ");
        arLength = number.nextInt();

        int data[] = new int[arLength];

        //masukkan data array
        System.out.println("Masukkan bilangan GENAP sebanyak " + arLength + " kali!");
        for(int i = 0; i < arLength; i++){
            System.out.print("Bilangan genap ke-" + (i+1) + " : ");
            data[i] = number.nextInt();
            if(data[i] % 2 == 1){
                System.out.println("");
                System.out.println("Maaf bilangan yang Anda masukkan bukan bilangan genap!");
                System.out.print("Mohon masukkan ulang Bilangan ke-" + (i+1) + " : ");
                data[i] = number.nextInt();
            }
        }
        //tampilkan array yang diinputkan
        System.out.println("");
        System.out.print("Bilangan yang Anda masukkan : ");
        for(int x = 0; x < arLength; x++){
            System.out.print(data[x] + " ");
        }

        //urutkan array
        for(int y = 0; y < arLength-1; y++){
            for(int z = 0; z < arLength-y-1; z++){
                if(data[z] > data[z+1]){
                    temp = data[z];
                    data[z] = data[z+1];
                    data[z+1] = temp;
                }
            } 
        }

        //tampilkan hasil pengurutan
        System.out.println("");
        System.out.print("Bilangan setelah diurutkan  : ");
        for(int outputData : data){
            System.out.print(outputData + " ");
    }
    
}
}
