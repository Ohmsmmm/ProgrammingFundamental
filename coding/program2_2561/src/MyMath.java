import java.util.*;
public class MyMath {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(pow(5,-2));
		
	}
	public static double pow(double x,int n)
	{	
		double p =1;
		for(int i = 1; i<=Math.abs(n); i++)
			p = p * x;
		if(n < 0)return 1/p;
		else return p;
	}
	public static long factorial(int n)
	{	
		if(n < 0)return -1;
		long fact = 1;
		for(int i = 1; i<=n; i++)
			fact = fact*i;
		return fact;
	}
}
