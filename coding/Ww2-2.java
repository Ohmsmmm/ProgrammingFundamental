class Ww2-2 
{
	public static void main(String[] args) 
	{
		int [] a = new int [] {3, 7, 3, 5, 7};
		int n = a.length;
		int m = 7 + 1; //m = max(a[]) + 1 (?????????????????+1)
		int mCount = 0;
		int md= 0;
		int b = new int[m];
		//for (i = 0; i < m; i++) { b[i] = 0; }

		for (int i = 0; i < n ; i++) {
			b[a[i]]++;
		}
		//for (i = 0; i < m; i++)
		// print{b[i] + " ")
		print(b);
	}
}
