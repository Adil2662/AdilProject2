package Questions;

public class Q2 {
	
	 
	    // Method to print
	    // first n Fibonacci Numbers
	    public void printFibonacciNumbers(int n)
	    {
	        int f1 = 0, f2 = 1, i;
	 
	        if (n < 1)
	            return;
	        System.out.print(f1 + " ");
	        for (i = 1; i < n; i++)
	        {
	            System.out.print(f2 + " ");
	            int next = f1 + f2;
	            f1 = f2;
	            f2 = next;
	        }
	        System.out.print("\n");
	    }

}
