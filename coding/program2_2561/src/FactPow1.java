import java.util.*;
public class FactPow1 {
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number => ");int n = sc.nextInt();
		double sum = 0;
		for(int i = 1; i <= n; i++)
			sum = sum + MyMath.factorial(i)/MyMath.pow(i,2);
		System.out.print(sum);
	}
	
	
}
