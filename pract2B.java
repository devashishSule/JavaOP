// Write a Java program to convert a decimal number to binary number and vice versa.

public class pract2B {
    public static void main(String[] args) {
        int[] binaryNum = new int[100];
        int num = 8;
        int i = 0;
        System.out.println("Decimal number: " + num);
        while (num>0) {
            binaryNum[i] = num % 2;
            num = num / 2;
            i++; 
        }
        System.out.print("Binary conversion: ");
        for (int j=i-1;j>=0;j--) {
            System.out.print(binaryNum[j]);
        }
    }
}
