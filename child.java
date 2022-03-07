class parent{ //parent class]
    void method(){
        System.out.println("Method in parent class.");
    }
}

class child extends parent{
    @Override void method(){ // method overriden
        System.out.println("Method in child class.");
    } 

    public static void main(String[] args) {
        child ob = new child();
        ob.method(); // will print method in child class
    }    
}
