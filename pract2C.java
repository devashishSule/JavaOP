public class pract2C {
    public static void main(String[] args) {
        int num=12345;
        int numRepeat=num;
        int remainder;
        int reverseNumber=0;
        while (num!=0) {
            remainder=num%10;
            reverseNumber=reverseNumber*10+remainder;
            num=num/10;
        }
        System.out.println("Reverse of " + numRepeat + " is " + reverseNumber);
    }
}
