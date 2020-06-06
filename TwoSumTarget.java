package arraypractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumTarget {
	
	
	
	static boolean twoSum(int arr[], int x)
	{
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		while(i<j)
		{
			if(arr[i]+arr[j] > x) {
				j--;
			}
			if(arr[i] + arr[j] < x) {
				i++;
			}
			if(arr[i] + arr[j] == x) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++)
		{
			arr[i] = scan.nextInt();
		}
		int X = scan.nextInt();
		
		if(twoSum(arr,X))
		{
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		

	}

}
