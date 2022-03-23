// Write a Java program to display the following pattern.
// *******
//  *****
//   ***
//    *



public class pract1B {
    public static void main(String[] args) {
        int a=3; // no. of rows
        for(int i=0;i<=a;i++){ // new line counter
            for(int j=0;j<=i-1;j++){ // no. of spaces
                System.out.print(" ");
            }
            for(int k=0;k<(2*a-(2*i-1));k++){ // print stars
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
