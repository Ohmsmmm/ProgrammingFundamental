class Ww2p2 
{
	public static void main(String[] args) 
	{
		int [] a = new int [] {3, 7, 3, 5, 7};
		int n = a.length;
		int m = 7 + 1; //m = max(a[]) + 1 (?????????????????+1)
		int mCount = 0;
		int md= 0;
		int [] b = new int [m];
		//for (i = 0; i < m; i++) { b[i] = 0; }

		for (int i = 0; i < n ; i++) {
			b[a[i]]++;
		}
		for (int i = 0; i < m; i++)
		System.out.print(b[i] + " ");
		
		for (int i = 0; i < m ; i++) {
			if(b[i] > mCount)
			{
				mCount = b[i];
				md = i;
		    }
		}
		System.out.printf("\n%d\n",mCount);
		System.out.println(md);

	}
}
