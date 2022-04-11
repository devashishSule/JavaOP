class recurrsion{
    void tableOf(int x){
        if(x==0 || x==1){
            System.out.println("Dude, you are dumb.");
        }
        else{
            for(int i=1; i<=10; i++){
                System.out.println(x + " * " + i + " = " + x*i);
            }
        }
    }
}

public class multiplier {
    public static void main(String[] args) {
        recurrsion math = new recurrsion();
        math.tableOf(/*number of table you want*/5);
    }
}
