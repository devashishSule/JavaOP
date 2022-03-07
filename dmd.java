class kaguya{
    void Otsutsuki(){
        System.out.println("Kaguya Otsutsuki - the hot chick.");
    }
}

class hagoromo extends kaguya{
    @Override void Otsutsuki(){
        System.out.println("Hagoromo(Sage Of The Six Paths) - son of the hot chick.");
    }
}

class hamura extends kaguya{
    @Override void Otsutsuki(){
        System.out.println("Hamura(Founder of Shinobi of moon) - twin brother of Hagoromo.");
    }
}
// Hierarchical inheritance plays an important role here
class dmd {
    public static void main(String[] args) {
        kaguya noob = new kaguya(); // object creation for class kaguya
        hagoromo god = new hagoromo(); // object creation for class hagoromo
        hamura useless = new hamura(); // object creation for class hamura
        kaguya fights; // reference object

        fights = noob; // reference obj. = class obj. 
        fights.Otsutsuki(); // calls the method of class which obj is mentioned.

        fights = god; // reference obj. = class obj. 
        fights.Otsutsuki(); // calls the method of class which obj is mentioned.

        fights = useless; // reference obj. = class obj.
        fights.Otsutsuki(); // calls the method of class which obj is mentioned.
        
    }
}
