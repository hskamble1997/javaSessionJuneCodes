package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		// approach2(arr);

		String str[] = { "java", "c#", "python", "java", "python" };
		approach4(str);

	}

	public static void approach1(int arr[]) {
		Set<Integer> hset = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!hset.contains(arr[i])) {
				hset.add(arr[i]);
			} else {
				list.add(arr[i]);
			}
		}

		for (int dups : list) {
			System.out.print(dups + " ");
		}
	}

	public static void approach2(int arr[]) {

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("Duplicate element found " + arr[j]);
					flag = true;
				}
			}
		}

		if (flag == false) {
			System.out.println("No duplicate element found");
		}

	}

	public static void approach3(String str[]) {
		boolean flag = false;

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					System.out.println("Duplicate element found " + str[i]);
					flag = true;
				}
			}
		}

		if (!flag) {
			System.out.println("No duplicate element found");
		}

	}

	public static void approach4(String str[]) {

		boolean flag = false;
		HashSet<String> hset = new HashSet<>();

		for (int i = 0; i < str.length; i++) {
			if (!hset.add(str[i])) {
				System.out.println("Duplicate ele found : " + str[i]);
				flag = true;
			}
		}

		if (!flag) {
			System.out.println("No duplicates found in array");
		}

	}

	public static void approach5() {
		int arr[] = { 3, 2, 1, 4, 5, 3, 4 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j <= i; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(arr[i] + " : " + count);
			}
		}
	}

}
