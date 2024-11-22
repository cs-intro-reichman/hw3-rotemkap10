// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    
	    System.out.println(div(1000, 200));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		if(x2<0)
		{
			for(int i =0; i>x2 ; i--)
			{
				x1--;
			}
		}
		if(x2>0)
		{
			for(int i = 0; i<x2; i++)
			{
				x1++;
			}
		}
		return x1;
	}
	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		int i =1;
		int j =-1;
		int newNumber = x1;
		if(x2<0)
		{
			while(j>=x2)
			{
				newNumber++;;
				j--;
			}
		
		}
		if(x2>0)
		{
			while(i<=x2)
			{
				newNumber--;;
				i++;
			}
		
		}
		return newNumber;
	 
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int newNumber = x1;
		if(x2>0)
		{
			for(int i =1; i<x2 ; i++)
			{
				x1 = plus(x1, newNumber);
			}
		}
		else if(x2<0)
		{
			for(int i =-1 ; i>x2; i--)
			{
				x1 = plus(x1, newNumber);
			}
			x1 = -x1;
		}
		else if(x1 == 0 || x2 ==0)
		{
			return 0;
		}
		else
		{
			return x1;	
		}
		return x1;
		
		
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int newNumber = 1;
		if(x<0)
		{
			x= -x;
			for(int i =0; i<n ; i++)
			{
				newNumber =times(newNumber, x);
			}
			if(mod(n ,2 )==0)
			{
				return newNumber;
			}
			else{
				return -newNumber;
			}
			
		}
		else if(x>0)
		{
			for(int i =0; i<n ; i++)
			{
				newNumber =times(newNumber, x);
			}
			return newNumber;
		}
		else
			return 0;
	
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int newNumber = x1;
		int count = 0;
	
		// Make x1 and x2 positive for simplicity
		if (x1 < 0 && x2 > 0) {
			x1 = -x1;
		} else if (x1 > 0 && x2 < 0) {
			x2 = -x2;
		} else if (x2 < 0 && x1 < 0) {
			x1 = -x1;
			x2 = -x2;
		}
	
		// Subtract x2 from x1 until newNumber is less than x2
		while (newNumber >= x2) {
			newNumber = plus(newNumber, -x2);  // Using plus() to subtract
			count++;  // Count the number of subtractions
		}
	
		return count;
		}
		

	

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		if(x1< 0 && x2>0)
		{
			x1 = -x1;
		}
		else if(x1>0 &&x2<0)
		{
			x2 = -x2;
		}
		else
		{

		}
		int newNumber = times(div(x1 ,x2), x2);
		int theMod = minus(x1 , newNumber);
		return theMod;
		
		
		
		
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int i =0;
		int newNumber = 0;
		if(x==1)
		{
			return 1;
		}
		if(x<0)
		{
			return -1;
		}
		if(x ==0)
		{
			return 0;
		}
		while(newNumber<x)
		{
			newNumber = pow(i,2);
			i++;
		}
		if(newNumber!=x)
		{
			return i-2;
		}
		else
		{
			return i-1;
		}
		

		
		
	}	  	  
}