import java.lang.Math;

class prac2{
    
    public static void main(String[] args){
        String c1[] = {"1","0","0","0","1","0", "1", "1"};  //binary bits 2^7
        int pow2 = 0;
        int sum = 0;
        for (int i=(c1.length-1);i>=0; i--) {
            int num = Integer.parseInt(c1[i]);
            double exp = Math.pow(2,pow2);
            sum += (num * exp);
            pow2++;
            }
            System.out.println(c1);
            System.out.println("Decimal : "+ sum);
            
    }
}