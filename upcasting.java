
class parent {
    String fact;
    // This is the parent class
    // Creating a method
    void method(){
        System.out.println("Method in parent class.");
    }
}

class child extends parent{
    int a = 10;
    // overriding the method from parent class
    @Override void method(){
        System.out.println("Method in child class.");
    }
}

public class upcasting {
    public static void main(String[] args) {
        // accessing child obj to parent obj
        parent p = new child();
        p.fact = "Java sucks. Reality is often disappointing";
        System.out.println(p.fact);
        p.method(); // here method from child class is invoked
        // So, here variable from parent class and method from child class is invoked.
         
    
    }
}
