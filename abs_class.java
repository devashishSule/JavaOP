// abstract class cannot create an object 
abstract class parent{
    abstract void show();
    void display(){
        System.out.println("This is method in abstract class.");
    }
}

class child extends parent{
    void show(){
        System.out.println("Child abstracts from Parent.");
    }
}

class abs_class {
    public static void main(String[] args) {
        // A ref;
        child obj = new child();
        obj.show();
        obj.display(); 
    }    
}
