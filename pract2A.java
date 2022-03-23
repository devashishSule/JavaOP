// Write a program to add two binary numbers.

public class pract2A {
    public static void main(String[] args) {
        // declare variables
        long num1 = 1100, num2 = 1100;
        int n1 = (int)num1, n2 = (int)num2;
        int i = 0;
        int carry = 0;
        int[] sum = new int[20]; // declaring new array

        // while loop
        while (num1!=0 || num2!=0) {
            sum[i++] = (int)((num1%10 + num2%10 + carry) % 2);
            carry = (int)((num1%10 + num2%10 + carry)/2);
            num1=num1/10;
            num2=num2/10;
        }
        if (carry != 0){
            sum[i++] = carry;
        }
        --i;
        System.out.println("Binary number 1: " + n1);
        System.out.println("Binary number 2: " + n2);
        System.out.println("Carry: " + carry);
        System.out.print("Sum of two binary numbers: ");
        while (i>=0) {
            System.out.print(sum[i--]);
        }
        System.out.println("");
    }
}


/*
  1100 (12)
+ 1100 (12)
-------
  11000(24)


*/