import java.util.Scanner;
class PerfDefAbandNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number => ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i < n-1; i++)
			{
				if(n % i == 0)
					sum = sum + i; 
			}
			if (sum == n)
				System.out.println(n + "is Perfect");
			else if (sum < n)
					System.out.println(n + " is Deficient");
			else System.out.println(n + " is Abandant");			
	}
}
