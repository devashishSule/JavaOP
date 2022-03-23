public class fibonnacci {
    void fibo(int x){
        int a = 0;
        int b = 1;
        int c = 0;
        if(x==1){
            System.out.println(a);
        }
        if(x>=2){
            System.out.println(a);
            System.out.println(b);
        }
        for(int i = 3;i<=x; i++){
            c = a + b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        int num = 8;
        fibonnacci f = new fibonnacci();
        f.fibo(num);
    }
}
/*
fibonnacci 
if num is 5
0 1 2 3 4 5

int a; 
int b;
a + b = c
print c
a=b
b=c


0
1
1
2
3
5
*/