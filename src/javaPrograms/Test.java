package javaPrograms;

public class Test {

	public static void main(String[] args)
	{
		
		int[] arr = {92,7,12,9,8,3};
		int max = arr[arr.length-1];
		
		int l = arr.length;
		System.out.println(max);
		for(int i = l-2; i>=0; i--)
		{
			if(arr[i] > max)
			{
				System.out.println(arr[i]);
				max = arr[i];
			}
			
		}
		
		
		
	}

}
