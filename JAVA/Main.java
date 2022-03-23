import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[]){
	String path = "C:\\Users\\athar\\OneDrive\\Desktop\\";
	int ch,s=0,stu;
	String st;
	Scanner scn = new Scanner(System.in); 
	FileOutputStream obj2 = null;
	try{
	obj2 = new FileOutputStream(path + "Stu_detail.txt");
	System.out.print("Num of students :");
	st = scn.nextLine();
	stu = Integer.parseInt(st);
	while(s < stu){
	String name;
	String roll;
	String addr;
	
	System.out.print("Enter Name : ");
	name = scn.nextLine();
	System.out.print("Enter addr : ");
	addr = scn.nextLine();
	System.out.print("Enter roll : ");
	roll = scn.nextLine();

	char name_arr[] = name.toCharArray();
	char addr_arr[] = addr.toCharArray();
	char roll_arr[] = roll.toCharArray();
	for(int i = 0 ; i < name_arr.length; i++){
	obj2.write((int) name_arr[i]);
	}
	obj2.write((int) '\n');
	for(int j = 0 ; j < addr_arr.length; j++){
	obj2.write((int) addr_arr[j]);
	}
	obj2.write((int) '\n');
	for(int k = 0 ; k < roll_arr.length; k++){
	obj2.write((int) roll_arr[k]);
	}	
	obj2.write((int) '\n');
	obj2.write((int) '\n');
System.out.println("\n\n");
System.out.println(name);
System.out.println(addr);
System.out.println(roll);
s++;
}
	obj2.close();
	}
	catch(Exception e){
		System.out.println("File not found / File creation error");
	}
	finally{
System.out.println("\nWrote...");
}
}

}