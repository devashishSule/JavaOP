class prac{
    public static void main(String arg[]){
        int a=225, i=0;            //Number decimal
        char c[] = new char [16];
        System.out.println("Enter number: "+a);
        while (a >= 0){
            if(a == 0){
                break;
            }
            else if(a%2 == 0){
                c[i]='0';
            }
            else{
                c[i]='1';
            }
            i++;
            a/=2;
        }
        System.out.print("Binnary is : ");
        for(int z=i;z>=0;z--){
            if(z == 3){
            System.out.print(" ");
            }
         System.out.print(c[z]);
        }
        //System.out.println(c);
    }
}