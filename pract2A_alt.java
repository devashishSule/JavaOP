public class pract2A_alt{
    public static void main(String[] args) {
        String a = "1011";
        String b = "100";
        System.out.println(a);
        System.out.println(b); 
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        System.out.println(x);
        System.out.println(y);
        int sum = x + y;
        System.out.println("Addition of binary numbers is " + Integer.toBinaryString(sum));
    } 
}
