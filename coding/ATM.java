import java.util.Scanner;
class ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Money => ");
		int bank = sc.nextInt();
		int b1000=0,b500=0,b100=0;
		if (bank%100 > 0 && bank%100<100){//กรณีใส่จำนวนเงินไม่ถึง100(1-99)
			System.out.println("Withdraw Only!! b1000,b500,b100");
		}
		else{
				 b1000 = bank/1000;
				 b500 = bank%1000/500;
				 b100 = bank%1000%500/100;
		
		System.out.println("b1000 = " + b1000);
		System.out.println("b500 = " + b500);
		System.out.println("b100 = " + b100);
		}
	}
}
