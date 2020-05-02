import java.util.*;
public class FactPow2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number => ");int n = sc.nextInt();
		double sum = -1;
		for(int i = 4; i <= n; i++)
		{	
			double x = MyMath.factorial(i)/MyMath.pow(i,3);
			if(i%2 != 0)
			{	x = x * -1;
				sum = sum + x;
			}
			else sum = sum + x;
		}	
		System.out.print(sum);
	}
}
