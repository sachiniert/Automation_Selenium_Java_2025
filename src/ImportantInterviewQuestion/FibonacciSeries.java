package ImportantInterviewQuestion;

public class FibonacciSeries {

     public static void main(String[] args) {
//		int n=10; // number of terms to print 
//		int a = 0,b=1;
//		
//		System.out.println("fibonaci series: ");
//		
//		for ( int i = 1; i<=n; i++)
//		{
//			System.out.println(a + "");
//			int next = a+b;
//			a = b;
//			b = next;
//		}

    	 int n = 10;  // How many terms to print
         int a = 0, b = 1;

         System.out.print("Fibonacci Series: " + a + " " + b);

         for (int i = 2; i < n; i++) {
             int c = a + b;
             System.out.print(" " + c);
             a = b;
             b = c;
         }
	}

}
