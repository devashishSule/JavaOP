public class pract2C_ {
    public static void main(String[] args) {
        String str = "Anuradha";
        String reverseStr = "";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            reverseStr = ch + reverseStr ;
        }
        System.out.println("Original string: " + str);
        System.out.println("Reverse string: " + reverseStr);

    }
}
