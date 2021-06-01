package ARRAY_FINAL;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		
		int a[]= {12,6,1,5,7};
		int temp;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println("Sorting an array without using method "+Arrays.toString(a));
	}
}
