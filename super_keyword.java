class naruto{
    String clan = "Uzumaki";
}

class sasuke extends naruto{
    String clan = "Uchiha";
    void printClan(){
        System.out.println("Shadow Hokage: Sasuke " + clan); // class sasuke var will be displayed
        System.out.println("Seventh Hokage: Naruto " + super.clan); 
        // super invokes var of parent class i.e class naruto
    }
}

public class super_keyword {
    public static void main(String[] args) {
        sasuke sharingan = new sasuke(); // obj created
        sharingan.printClan();
    }
}
