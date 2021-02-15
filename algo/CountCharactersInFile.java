package algo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountCharactersInFile {
 public static void main(String[] args) throws IOException
 {    int[] charCount = new int[26];
 	  char ch;
 	  int nextChar;
 	  File file = new File("D:\\Vaadin-Training\\test.txt");
	 BufferedReader br = new BufferedReader(new FileReader(file));
	 while((nextChar=br.read())!=-1)
	 {
		 ch = (char)nextChar;
		 
		 if(ch>='a' && ch<='z')
		 {
			 charCount[ch -'a']++;
		 }
	 }
	 for(int i=0; i<26; i++)
	 {
		 
		 System.out.printf("%c = %d\n", i+ 'A',charCount[i]);
	 }
	 br.close();
 }
}
