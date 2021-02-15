package linkedList;

public class Test {

//    public static void main(String[] args) {
//
//
//        foo(null);
//    }
//    public static void foo(Object o){
//        System.out.println("Object argument");
//    }
//
//    public static void foo(String s) {
//        System.out.println("String argument");
//    }
//    public static void foo(StringBuffer i) {
//        System.out.println("StringBuffer impl");
//    }
     int a = 10;
     static int b = 20;


        private String function()
        {
            return ("GFG");
        }
        public  static String function(int data)
        {
            return ("GeeksforGeeks");
        }
        public static void main(String[] args)
        {
            Test test1 = new Test();
            test1.a = 100;
            test1.b = 200;
            Test obj = new Test();
            System.out.println(test1.a + "  " + test1.b);
            System.out.println(obj.a + "  "+ obj.b);
            System.out.println("hello"+null);
        }

}
