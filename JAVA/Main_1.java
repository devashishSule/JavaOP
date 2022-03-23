//interface
 interface pokowner{
	String Name = "John Cena";
	String Gender = "Male";
	String Hometown = "USA";
	public void disp_own();
}


//abs clases
abstract class varType{
	String var;									//super classes
	abstract void set_varType(String var);
}

class pokemon extends varType{
   int attack;
   String name;
   int defense;

   void set_varType(String var){ 	//abs define
         this.var = var;   
   }

	void pok(){	//meth override
	System.out.println("Class pokemon");
	}

}
class pokedex extends pokemon{
    String region;
	void pok(){
	System.out.println("Class pokedex");
	}
}
//main class
class poktype extends pokedex implements pokowner{
    String type;
	void pok(){
	System.out.println("Class poketype");
	}
// interface meth body
	public void disp_own(){
		System.out.println("Owner name: " + Name);
		System.out.println("Owner gender: " + Gender);
		System.out.println("Owner hometown: " + Hometown);

	}

    void show(){
		System.out.println("");
		System.out.println("/////////////////");
		System.out.println("Pokemon Owner");
		disp_own();
		System.out.println("-----------------");
		System.out.println("Pokemon Stats");
		System.out.println("Pokemon " + attack);
       		System.out.println("Poke name: " + name);
 		System.out.println("Poke defense: " + defense);
 		System.out.println("Poke type: " + type);
                System.out.println("Poke region: " + region);
		System.out.println("Poke variant: " + var);
		System.out.println("=================");
    }
																			//overloaded meth
	void set(int attack, String name,int defense, String type, String region, String var){
		set_varType(var);   //abs called
		this.attack = attack;
		this.name = name;
		this.defense = defense;
		this.type = type; 
               	this.region = region;
}	
																//default meth	
	void set(){
		set_varType("Normal");
		attack = 69;
		name = "Charizard";
		defense = 600;
		type = "Fire/Fly"; 
        region = "Kanto";
	}
	

}

public class Main_1{
	//main
	public static void main(String args[]){
		pokemon poke; //ref var
		pokedex pok = new pokedex();
		
		poktype poke1 = new poktype(); // base cases
		poke = pok;
		poke1.set();
		poke1.show(); 	
		poke.pok();
		
	
	//meth overloading
			poktype poke2 = new poktype(); 
			
			poke2.set(67,"Bulbasur",300,"Poison/Grass","Hohen","Golden");
			poke2.show();
			
		
			poktype poke3 = new poktype();  
			poke3.set(89,"Mewtwo",900,"Psychic/Legendary","Hohen","Mystic");
			poke3.show();
	
	}
}
