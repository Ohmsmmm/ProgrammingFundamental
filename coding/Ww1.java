class Ww1 
{
	public static void main(String[] args) 
	{
		int [] d = new int [] {6, 3, 7, 3, 4};
		int sum = 0;
		int mean = 0;
		int mode = 0;
		for (int j = 0; j < d.length; j++) 
		{   //d.length = 5;
			sum = sum + d[j];
		}
		mean = sum / d.length;
		int maxCount = 0;
		int i = 0;
		int k = 0;
		while (i < d.length)
		{	
			int count = 0;
			for ( int j = 0; j < d.length; j++ )
			{
				if (d[i] == d[j])
				{
					count++;
					k = k + 1;
				}
				if (count > maxCount)
				{
					maxCount = count;
					mode = d[i];
				}
			} // for j
			i+=1;
		} // while i
		System.out.println(mean + " " + mode);
	}
}
