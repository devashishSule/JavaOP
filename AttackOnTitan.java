
class eren {
    // This is Method Overloading
    void God(){ 
        System.out.println("No parameters. (tatakae)");
    }

    // Same method name but different parameter
    void God(String a){ // here String a is a parameter
        System.out.println("Eren's titan form: " + a);
    }

    void God(int a,int b){
        int c = a+b;
        System.out.println("Total AoT episodes in Season 4: " + c);
        // new episode every sunday
    }
    
}

public class AttackOnTitan {
    public static void main(String[] args) {
        eren ob = new eren();
        ob.God();
        ob.God("Attack Titan/Founding Titan");
        ob.God(15,8);
    }
}
