class Complex{
    Complex(int x1,int y1,int x2,int y2){
        System.out.print("\nAddition is " + (x1 + x2) + "+" + (y1 + y2) + "j");
    }

    public void diff(int x1,int y1,int x2,int y2){
        System.out.println("\nSubstraction is " + (x1 - x2) + "+" +(y1 - y2) + "j");
        

    }
}
class HelloWorlds {
    public static void main(String[] args) {
        Complex c1 = new Complex(1,2,3,4);
        c1.diff(1,2,3,4);
    }
}