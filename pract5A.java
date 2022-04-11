// Multi-level inheritance and multiple in a single program


interface info {
    int ID = 104;
    String Name = "Devashish Sule";
    public void display_info(); // method declared
}


class info2 { // parent class
    String City = "Mumbai";
    String Country = "India";
    // public void address();
}

class printinfo extends info2 implements info{ // child class
    public void display_info(){
        System.out.println("Roll no. of candidate: " + ID);
        System.out.println("Name of candidate: " + Name);
    }
}  

class pract5A {
    public static void main(String[] args) {
        printinfo p = new printinfo(); // object created here 
        p.display_info();
        System.out.println("Address of candidate: " + p.City + ", " + p.Country);
        System.out.print("Country of candidate: " + p.Country);
    }
}