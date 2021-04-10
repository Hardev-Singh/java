class mini
{
	public static void main(String s[])
	{
		
		int a[]={2,7,5,6,7,4,3,2};
		int small=a[0],large=a[0];
		for(int x=0;x<8;x++)
		{
			if(a[x]<small)
				small=a[x];
			
            if(a[x]>large)	
                 large=a[x];				
		}
		
		
		System.out.println("the smallest no. is "+small);
			
		System.out.println("the largest no. is "+large);
			
	}
}