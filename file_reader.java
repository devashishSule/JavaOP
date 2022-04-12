import java.io.*; // all packages imported
public class file_reader {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Devashish\\OneDrive\\Desktop\\JavaOP\\Sample_text.txt";
        String fileOut = "C:\\Users\\Devashish\\OneDrive\\Desktop\\JavaOP\\Copied_text.txt";
        
        try{
            FileReader fr = new FileReader(fileName); //obj creation of reader
            FileWriter fw = new FileWriter(fileOut); //obj creation of writer
            String str = "";
            int i;
            while((i=fr.read()) != -1){
                str = str + (char)i; 
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
