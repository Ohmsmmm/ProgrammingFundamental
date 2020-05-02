import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Num:");
	int n = sc.nextInt();
	for (int j = 1; j <= n ;j++ )
	{
		
		int i = 1;
		int count = 0;
		String x;
		while (i <= j)
		{
			if (j % i == 0)
				count++;
				i++;
		}
		if (count == 2)
			{
				x = " prime";
			}
		else x = "not prime";
	    System.out.println(j + ""+ x);
	}
     
    }
}
				

