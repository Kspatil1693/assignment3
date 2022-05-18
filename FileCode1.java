package package3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
public class FileCode1
{
 public static void main(String[] args) throws IOException
 {
   createFileUsingFileClass();	
//   createFileUsingFileOutputStreamClass();  
	// createFileIn_NIO();  
	 }

 private static void createFileUsingFileClass() throws IOException
 {
	 File file=new File("D://Files/testFile.txt");
	 
	 //create the file
	 if(file.createNewFile()==true)
	 {
		 System.out.println("File is created");
	 }
	 else
	 {
		 System.out.println("File is already exist");
	 }
	 //write content
	 FileWriter writer= new FileWriter(file);
	 writer.write("Test data17-05-22");
	 writer.close();
	 
	 }
 private static void createFileUsingOutputStreamClass()throws IOException
 {
	 String data="Test Data";
	 FileOutputStream out=new FileOutputStream("D://Files//testFile2.txt");
	 out.write(data.getBytes());
	 out.close();
 }
 private static void createFileIn NIO() throws IOException
 { 
	 String data="Test data";
	 File.write(Paths.get("D://File//testFile3.txt"),data.getBytes());
	 List<String>lines=Array.asList("1st line","2nd line");
	 Files.write(Paths.get("D://Files//file6.txt"),lines,
			 StandardCharset.UTF_8,
			 StandardOpenOption.CREATE,
			 StandardOpenOption.APPEND);
 }
}



































