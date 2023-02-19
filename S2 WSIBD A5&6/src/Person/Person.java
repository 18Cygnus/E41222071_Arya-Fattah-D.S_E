/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author aryas
 */
//this class will define a person and the information about a person that is needed
class profile{
    String FName;
    String IName;
    int StuId;
    boolean stuStatus;
    
    public void set (String FName, String IName, int StuId, boolean stuStatus){
        this.FName = FName;
        this.IName = IName;
        this.StuId = StuId;
        this.stuStatus = stuStatus;
    }
    
    public void show (){
        System.out.println("Student Name : "+FName+ " "+IName);
        System.out.println("Student ID : "+StuId);
        if(stuStatus==true){
            System.out.println("Student Status : Active");
        }else{
            System.out.println("Student Status : Not Active");
        }
    }
}
public class Person {
    public static void main(String[] args){
        profile Lisa = new profile();
        Lisa.set("Lisa", "Palombo", 123456789, true);
        Lisa.show();
    }
}
