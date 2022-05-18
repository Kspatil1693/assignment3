package package3;
 import java.util.*;
 import java.nio.charset.*;
 import java.io.*;
 import java.nio.file.*;
 
public class FileCode2 {
	public static List<String>readFileinList(String fileName)
	{
		List<String>lines=Collections.emptyList();//creates an empty list
		try
		{
			lines=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
						
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return lines;
		}
		
	public static void main(String [] args)
	{
		List l=readFilelnList("D://Files//testFile2.txt");
		
		Iterator<String>itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	}














}
