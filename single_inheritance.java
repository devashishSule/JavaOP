class parent{
    String name = "Devashish Sule";
    
}

class child extends parent{
    int age = 20;
}

class single_inheritance {
    public static void main(String[] args) {
        child ob = new child();
        System.out.println("Name: " + ob.name);
        System.out.println("Age: " + ob.age);
    }
}
