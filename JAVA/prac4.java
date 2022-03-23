class prac4{
    public static void main(String[] args){
        String var1 = args[0];
        int countWord = 0, countletter=0, countnumber=0;
        for (int i = 0; i <var1.length(); i++){
           if(var1.charAt(i) == ' '){
            ++countWord;
           }
           if(var1.charAt(i) != ' '){
           countletter++;
           }
           if(Character.isDigit(var1.charAt(i))){
               countnumber++;
           }
        }
        countWord++; // last word inc
    System.out.println("Number of number : " + countnumber);
    System.out.println("Number of words : " + countWord);
    System.out.println("Number of letters/Symbols excluding space : " + countletter);
    }
}