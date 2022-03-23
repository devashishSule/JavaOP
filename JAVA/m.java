class M1{
public void comp(int x) throws ArithmeticException,NullPointerException{
        try{
        if (x < 10) throw new ArithmeticException("Exception is found less than 10");
        if (x > 10) throw new NullPointerException("Exception is found greater than 10");
        }
        catch (Exception e){
            System.out.println(e);
            throw e;
        }
    }
}


public class m extends M1{
    public static void main(String[] args){
        m obj1 = new m();
        try{
        //obj1.comp(1);
        obj1.comp(12);

        }
        catch (ArithmeticException e){
            System.out.println("Throws Exception arithMETIC");
        }
        catch (NullPointerException e){
            System.out.println("Throws Exception null");
        }
    }
    
}