package algo;

import java.io.File;

public class FileSearch {

	
	public String search(File file, String fileName)
	{
		 
		 
		if(file.isDirectory())
		{
		  File[] files = file.listFiles();
		  for(File file1: files)
		  {
			 String found = search(file1, fileName);
			 if(found!=null)
				 return found;
		  }		  
		}
		
		if(file.getName().equals(fileName))
			  return file.getAbsolutePath();
		
		return null;
	}
	
	public static void main(String[] args)
	{
		File file = new File("D:\\Vaadin-Training\\Eclipse4.4\\");
		FileSearch fileSearch = new FileSearch();
		String foundFile = fileSearch.search(file, "test.txt");
		System.out.println(foundFile);
	}
}
