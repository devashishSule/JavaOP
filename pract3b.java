
class pract3b{
    public static void count(String str){
        long sum=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(ch[i])){
                sum+=Character.getNumericValue(ch[i]);
            }
        }
        System.out.println("Given String: " + str);
        System.out.println("Addtion is: " + sum);
    }
    public static void main(String args[]){
        String s = "0123456789";
        count(s);
    }
}
