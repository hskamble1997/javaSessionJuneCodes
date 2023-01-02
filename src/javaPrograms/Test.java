package javaPrograms;

public class Test {

	public static void main(String[] args)
	{
		
		int[] arr = {92,7,12,9,8,3};
		int maxx = arr[arr.length-1];
		
		int l = arr.length;
		System.out.println(maxx);
		for(int i = l-2; i>=0; i--)
		{
			if(arr[i] > maxx)
			{
				System.out.println(arr[i]);
				maxx = arr[i];
			}
			
		}
		
		
		
	}

}
