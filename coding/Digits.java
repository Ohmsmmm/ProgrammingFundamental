import java.util.Scanner;
class Digits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		int n = 0;
		int a;
		double ans = 0;
		while (digit !=0)
		{
			 a = digit%2;
			 digit = digit/2; 
			 ans = a*Math.pow(10,n) + ans;
			 n++;
		}
		System.out.println(ans);
	}

}
