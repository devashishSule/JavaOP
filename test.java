
interface Sample {
	String name = "Vijay Dalvi";
    public void show();
}

// Class Declaration 
class Student { 
	int roll_no = 16;
} 

class display extends Student implements Sample {
    public void show(){
        System.out.println("Student name: " + name);
        System.out.println("Student roll no: " + roll_no);
    }
}

// Class Declaration 
class test { 
	public static void main(String[] args){
		display d = new display();
        d.show();
	}
}

