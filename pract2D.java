// To verify if the mentioned number is a palindrome or not??

/**
 * pract2D
 */
class pract2D {

    public static void main(String[] args) {
        int num=101;
        int numRepeat=num;
        int remainder;
        int reverseNumber=0;
        while (num!=0) {
            remainder=num%10;
            reverseNumber=reverseNumber*10+remainder;
            num=num/10;
        }
        if (reverseNumber == numRepeat) {
            System.out.println("The number "+numRepeat+" is palindrome.");
        } 
        else {
            System.out.println("The number "+numRepeat+" is not palindrome.");
                
        }
    }
}
