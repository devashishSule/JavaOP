// import java.util.jar.Attributes.Name;

public class Student {
    String name;
    int roll_no;
    
    // constructor for class Student
    // constructor overloading
    Student(){
        System.out.println("Constructor initialized");
    }

    Student(int age){
        // Constructor called
        System.out.println("Age of the student: " + age);
    }

    public static void main(String[] args) {
        Student d1 = new Student(); // initialized object
        Student d2 = new Student(); // initialized object

        d1.name = "Devashish";
        d2.name = "Yash";
        d2.roll_no = 69;
        d1.roll_no = 68;
        
        System.out.println("Name: " + d1.name);
        System.out.println("Roll no: " + d1.roll_no);
        Student d3 = new Student(19);
        
        System.out.println("------------------");
        System.out.println("Name: " + d2.name);
        System.out.println("Name: " + d2.roll_no);
        Student d4 = new Student(20);
    }
}