import java.util.Scanner;
class GcdLcd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num1 =>");
		int p = sc.nextInt();
		System.out.print("Enter Num2 =>");
		int q = sc.nextInt();
		int x = p * q;
		int t;
		for (  ;q != 0 ;  )
			{
				t = q;
				q = p%q;
				p = t;
			} 
		System.out.println("Gcd is " + p);
		System.out.println("Lcd is " + (x/p));
	}
}
