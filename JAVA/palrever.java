class palrever{
    public static void main(String[] args){
        int og = 121;
        int rev = 0;
        int saved = og;
        while(og !=0 ){
          rev = rev * 10 + og % 10;
          og/=10;   
        }
        System.out.println("Reversed Number is : "+rev);
        if(saved == rev){
            System.out.println(saved +"The number is a Palindrome");
        }
        else{
        System.out.println(saved +"The number is not a Palindrome");
        } 
    }
}