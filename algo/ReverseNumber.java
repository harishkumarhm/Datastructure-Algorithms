package algo;

public class ReverseNumber {
  public static void main(String[] args)
  {
	  int num = 267;
	  int result =0;
	  while(num > 0)
	  {
		  result = result* 10 + num%10;
		  num = num/10;
	  }
	  System.out.println(result);
  }
}
