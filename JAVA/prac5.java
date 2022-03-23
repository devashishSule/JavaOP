public class prac5{
   static public void decimaltobinary(int sum){
        char c[] = new char[16];
        int i = 0;
            while (sum >= 0){
                if(sum == 0){
                    break;
                }
                else if(sum%2 == 0){
                    c[i]='0';
                }
                else{
                    c[i]='1';
                }
                i++;
                sum/=2;
            }
            for(i=c.length-1; i>=0; i--){
                if (i == 3) {
                    System.out.print(" ");
                }
            System.out.print(c[i]);
            }
    }

    static public int binarytodecimal(char c[],int sum){
       int pow2 = 0;
        for (int i=(c.length-1);i>=0; i--) {
            int num = Character.getNumericValue(c[i]);
            double exp = Math.pow(2,pow2);
            sum += (num * exp);
            pow2++;
            }
        return sum;
    }

    public static void main(String[] args) {
        char c2[] = {'0','0','0','0','0','1','0','1'};  //binary bits 2^7
        char c1[] = {'0','0','0','0','0','1','0','1'};
        int sumr = 0;
            System.out.println(c1);
            System.out.println(c2);
            sumr = binarytodecimal(c1,sumr);
            sumr = binarytodecimal(c2,sumr);
            System.out.println("Decimal : "+ sumr);
            decimaltobinary(sumr);
            
        }
}