package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortBuiltInMethods {

	public static void main(String[] args) {
		
		int[] arr = {3,4,2,1,9,5,6,7,8,11};
		System.out.println("Array before sorting : "+Arrays.toString(arr));
		//Arrays.parallelSort(arr);
		
		Integer[] wrappedInts = Arrays.stream(arr)
		                              .boxed()
		                              .toArray(Integer[]::new);
		Arrays.sort(wrappedInts,Collections.reverseOrder());
		System.out.println("Array after sorting : "+Arrays.toString(wrappedInts));

	}

}
