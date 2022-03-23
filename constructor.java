// import java.util.jar.Attributes.Name;

public class constructor {
    String name;
    int roll_no;
    
    // constructor for class Student
    // constructor overloading
    constructor(){
        System.out.println("Constructor initialized");
    }

 /*    constructor(int age){
        // Constructor called
        System.out.println("Age of the student: " + age);
    }  */ 

    public static void main(String[] args) {
        constructor d1 = new constructor(); // initialized object
        constructor d2 = new constructor(); // initialized object

        d1.name = "Devashish";
        d2.name = "Yash";
        d2.roll_no = 69;
        d1.roll_no = 68;
        
        System.out.println("Name: " + d1.name);
        System.out.println("Roll no: " + d1.roll_no);
        // constructor d3 = new constructor(19);
        
        System.out.println("------------------");
        System.out.println("Name: " + d2.name);
        System.out.println("Roll no: " + d2.roll_no);
        // constructor d4 = new constructor(20);
    }
}