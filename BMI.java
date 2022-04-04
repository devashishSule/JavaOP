

public class BMI {
    String person1 = "Devashish Sule";
    String person2 = "Soham Hirlekar"; 
    double weight; // in kgs
    double height; // in cms
    

    BMI(double x,double y){
        weight = x;
        height = y;
    }
    
    double MassIndex(){
        return (weight/((height/100)*(height/100)));
    }

    void conclusion(double x){
        if(x>=24.5 && x<=27.0){
            System.out.println("You are Fit.");
        }
        if(x<24.5){
            System.out.println("You are Under-weight.");
        }
        if(x>=28.0 && x<30){
            System.out.println("You are Over-weight.");
        }
        if (x>=30.0){
            System.out.println("You are Obese.");
        }
    }

    public static void main(String[] args) {
        BMI Person1 = new BMI(92.0,180);
        double MI1 = Person1.MassIndex();
        System.out.println("Name: " + Person1.person1);
        System.out.println("Height: " + Person1.height);
        System.out.println("Weight: " + Person1.weight);
        System.out.println("Body Mass Index (BMI): " + MI1);
        Person1.conclusion(MI1);

        System.out.println("---------------------");

        BMI Person2 = new BMI(82.0,175.0);
        double MI2 = Person2.MassIndex();
        System.out.println("Name: " + Person2.person2);
        System.out.println("Height: " + Person2.height);
        System.out.println("Weight: " + Person2.weight);
        System.out.println("Body Mass Index (BMI): " + MI2);
        Person2.conclusion(MI2);

    }
}