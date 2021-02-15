package algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class TestClass {
private String name;
//private TestClass()
//{
//	
//}
//public TestClass(String name)
//{
//	this.name = name;
//}
public void sayHello()
{
	System.out.println("Hello" + name);
}
//public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
// int n = in.nextInt();
// String s = in.next();
// int k = in.nextInt()%26;
// char[] chArr = s.toCharArray();
// 
// for(int i=0; i < chArr.length; i++)
// {
//   if(Character.isAlphabetic(chArr[i]))
//   {
//      int ascii = ((int)chArr[i] + k);
//      if((int)chArr[i] > 64 && (int)chArr[i] < 91 )
//      {
//    	  while(ascii < 65 || ascii > 90)
//          {
//              ascii = ascii % 91;
//              if(ascii< 65)
//                  ascii = ascii+65;
//          }
//      }
//      else if((int)chArr[i] > 96 || (int)chArr[i] < 123)
//      {
//       while(ascii < 97 || ascii > 122)
//       {
//           ascii = ascii % 123;
//           if(ascii< 97)
//               ascii = ascii+97;
//       }
//      }
//       chArr[i] = (char)ascii;
//   }
// }
// System.out.print(String.valueOf(chArr));
//	}

public static void main(String[] args) {
	 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner scanner = new Scanner(System.in);
    Long num = scanner.nextLong();
    BigInteger N  = null;
    long k = scanner.nextInt();
    String numStr = num + "";
    for(int i=1; i<k; i++)
    {
        numStr = numStr+num;
    }
    N = new BigInteger(numStr);
  //  System.out.print(superDigit(num));
}

//public static long digitSum(long num)
//{   if(num<=0)
//    return 0;
//    return num%10 +digitSum(num/10);
//}

public static long superDigit(BigInteger num) throws FileNotFoundException, IOException, ClassNotFoundException
{
//    if(num % new BigInteger(9)==0)
//        return 9;
//    else return (num%9);
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test"));
	ois.readObject();
	
	
	return 1L;
}
 
}


