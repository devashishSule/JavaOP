
class father{ // parent class 
    String name = "Nitin Sule";
}

class child1 extends father{
    String name = "Devashish Sule";
}

class child2 extends father{
    String name = "Suresh pseudoSule";
    void hagrya(){
        System.out.println(super.name);
    }
}


class hierarchical {
    public static void main(String[] args) {
        child1 ch1 = new child1();
        child2 ch2 = new child2();
        System.out.println(ch1.name);
        System.out.println(ch2.name);
        // System.out.println(super.name);
        ch2.hagrya();
    }    
}
