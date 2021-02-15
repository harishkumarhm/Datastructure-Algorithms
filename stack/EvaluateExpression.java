package stack;

import java.util.Stack;

public class EvaluateExpression {

    //ex: expression ="2*3+4" , return 10
    public static int evaluate(String expression)
    {

        Stack<Integer> operands = new Stack<>();
        for(int i=0; i< expression.length(); i++)
        {
            char ch  = expression.charAt(i);
            if(ch!='+'||ch!='*'|| ch!='-'||ch!='/')
            operands.push(Character.getNumericValue(ch));
        }
        int result =0;
       for(int j=0; j<expression.length() && !operands.isEmpty(); j++)
       {
           int a = operands.pop();
           int b = operands.isEmpty()?0:operands.pop();
           char ch = expression.charAt(j);
           switch(ch)
           {
               case('+'):
                   result = a+b;
                   operands.push(result);
               case('-'):
                   result =a-b;
                   operands.push(result);
               case('*'):
                   result=a*b;
                   operands.push(result);
               default:
                   continue;

           }
       }

        return result;
    }


    public static void main(String args[])
    {
        System.out.println(evaluate("2+3*4"));
    }
}
