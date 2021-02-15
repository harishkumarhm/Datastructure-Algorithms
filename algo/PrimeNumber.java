package algo;

public class PrimeNumber {

    static int limit = 100;

    public static void main(String[] args)
    {
        for(int i=0; i< limit; i++)
        {
            if(isPrime(i))
            System.out.println(i);
        }

    }

    public static boolean isPrime(int number)
    {
        if(number==0|| number==1)
            return false;
        if(number%2 ==0)
            return false;
        for(int i=3; i<= Math.sqrt(number); i=i+2)
        {
            if(number%i==0)
                return false;
        }
        return true;
    }
}
