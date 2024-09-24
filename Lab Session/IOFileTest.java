import java.io.*;
import java.util.*;

public class IOFileTest{
	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("IOFileTest.java");
        FileWriter fw=new FileWriter("IOFileTest.txt");

        int i;
     	while( (i=fr.read())!=-1){
         fw.write(i); 
         System.out.print((char)i);
     	}
    	 fr.close();
    	 fw.close();
	}
}