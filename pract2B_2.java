public class pract2B_2 {
    public static void main(String[] args) {
        int num = 1011;
        int decVal = 0;
        int base = 1;
        int ld;
        int temp = num;
        while (temp>0) {
            ld = temp % 10;
            temp = temp / 10;
            decVal = decVal + ld * base;
            base = base * 2;
        }
        System.out.println("Binary Number: " + num);
        System.out.println("Decimal Number: " + decVal);
    }
}
