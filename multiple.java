interface student{ 
    String name = "Vijay Dalvi";
    String address = "Thane";
    public void show();
}

class info101{ // parent class
    String name = "Sahil Tatkare";
    String address = "Dombivli";
}

class display extends info101 implements student{ // child class with multiple inheritance
    public void show(){
        System.out.println("Name: " + student.name);
        System.out.println("Address: " + student.address);
        System.out.println("--------------");
        System.out.println("Name: " + super.name);
        System.out.println("Address: " + super.address);
    }
}


public class multiple {
    public static void main(String[] args) {
        display d = new display();
        d.show();
    }
}

// multiple is inheritance
// it requires an interface to execute the code.
// you have to declare the methods public in an interface
