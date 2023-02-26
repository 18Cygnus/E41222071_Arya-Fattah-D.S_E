/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Statement.Tugas;

/**
 *
 * @author aryas
 */
public class Kelipatan_2 {
    public static void main(String[] args) {
        int i = 0;
        String line = new String(new char[25]).replace('\0', '-');
        
        System.out.println("       D0 While ");
        System.out.println("Kelipatan 2 antara 0-100");
        System.out.println(line);
        
        do {
            if(i % 2 == 0){
                System.out.print(i+ " ");
            }
            i++;
        } while (i <= 100);
        
        System.out.println("");
        
        System.out.println("       D0 While ");
        System.out.println("Kuadrat 2 antara 0-100");
        System.out.println(line);
        
        int j,pangkat;
        
        j = 0;
        pangkat=1;        
        do {
            pangkat*=2;
            System.out.print(pangkat+ " ");
            j++;
        } while (j <= 5);
    }
}
