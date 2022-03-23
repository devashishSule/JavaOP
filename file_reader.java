import java.io.*;
public class file_reader {
    public static void main(String[] args) {
        String fileName = "D:\\Bachelors of Science - IT\\B.Sc - IT ( Sem IV )\\Core Java (CJ)\\Practicals\\Sample text.txt";
        String fileOut = "D:\\Bachelors of Science - IT\\B.Sc - IT ( Sem IV )\\Core Java (CJ)\\Practicals\\Copied_text.txt";
        
        try{
            FileReader fr = new FileReader(fileName);
            FileWriter fw = new FileWriter(fileOut);
            String str = "";
            int i;
            while((i=fr.read()) != -1){
                str += (char)i; 
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("Some error occured.");
        }
    }
}
