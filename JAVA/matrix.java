class fuc{
    int m3[][] = new int[3][3];
    public void mul(int m[][] , int m1[][]){
       
        for(int i = 0; i < 3; i++){
            System.out.println(" ");
            for(int j = 0 ; j <3;j++){
                for(int k = 0 ; k < 3; k++){
                    m3[i][j] += m[i][k] * m1[k][j];
                }
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.println(" ");
            for(int j = 0 ; j < 3; j++){
                System.out.print(" " + m3[i][j] + " ");
            }
        }
    }
}
public class matrix extends fuc{

    
    public static void main(String[] args){
        int matrix1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int matrix2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        matrix m1 = new matrix();
        m1.mul(matrix1,matrix2);
    }
}