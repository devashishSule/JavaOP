// Multi-level inheritance and multiple in a single program

/**
 * pract5A
 */
/**
 * info
 */
interface info {
    int ID = 104;
    String Name = "Devashish Sule";
    public void display_info();
}

/**
 * Info2
 */ 
class info2 {
    String City = "Mumbai";
    String Country = "India";
    // public void address();
}

public class pract5A extends info2 implements info{
    public void display_info(){
        System.out.println("Roll no. of candidate: " + ID);
        System.out.println("Name of candidate: " + Name);
    } 
    public static void main(String[] args) {
        pract5A p = new pract5A(); // object created here 
        p.display_info();
        // System.out.println("ID of candidate: " + p.ID);
        // System.out.println("Name of candidate: " + p.Name);
        System.out.println("Address of candidate: " + p.City + ", " + p.Country);
        // System.out.print("Country of candidate: " + p.Country);

    }
}