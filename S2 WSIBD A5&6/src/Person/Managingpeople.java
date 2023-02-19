/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import Person.Person;

/**
 *
 * @author aryas
 */
class Person{
    public String name;
    public int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
}
public class Managingpeople {
    public static void main(String[] args){
        Person p1 = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);
        
        if(p1.getAge()==p2.getAge()){
            System.out.println(p1.getName()+" is the same age as "+p2.getName());
        }else{
            System.out.println(p1.getName()+" is NOT the same age as "+p2.getName());
        }
    }
}