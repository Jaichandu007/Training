import java.util.*;
public class Myclass{
    public static void main(String[] args){
        Student Jai = new Student();
        Student Teja = new Student();
        Student jabez = new Student();
        
        Jai.id = 345;
        Jai.age = 21;
        Jai.name = "jai";

        Teja.id = 344;
        Teja.age = 22;
        Teja.name = "Teja" ;

        jabez.id = 348;
        jabez.age = 20;
        jabez.name = "Jabez";
        
        System.out.println(Teja.name + " is " + Teja.age+" years old");
        System.out.println(Jai.name + " is " + Jai.age+" years old");
        System.out.println(jabez.name + " is " + jabez.age+" years old");
        


        }
}