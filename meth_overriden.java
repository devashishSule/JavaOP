class parent{ //parent class]
    void method(){
        System.out.println("Method in parent class.");
    }
}

class child extends parent{
    @Override void method(){ // method overriden
        System.out.println("Method in child class.");
        super.method();
    } 
}
class meth_overriden {
    public static void main(String[] args) {
        child ob = new child();
        // parent ob1 = new parent();
        ob.method(); // will print method in child class
        // ob1.method();
    }    
}