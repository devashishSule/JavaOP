
public class factorial {
    void fact(int x){
        System.out.println("The given number is " + x);
        if(x==1 || x==0){
            System.out.println("Factorial is 0.");
        }
        else{
            int fact = 1;
            for(int i = 1; i<=x; i++){
                fact = fact*i;
            }
            System.out.println("Factorial of " + x + " is " + fact);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        factorial f = new factorial();
        f.fact(num);
    }
}
