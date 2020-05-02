import java.util.Scanner;

public class PascalTri {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n =>"); int p = sc.nextInt();
		int m = p;
		for(int n = 0; n<=p; n++)
		{	
			for(int i = m; i>0; i--)
				System.out.print(" ");
			m = m-1;
			for(int r = 0; r<=n; r++)
			{	long x = MyMath.factorial(n)/(MyMath.factorial(n-r)*MyMath.factorial(r));
				System.out.print(x + " ");
			}
			System.out.println();
	    }
	}
}
