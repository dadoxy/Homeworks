package Weekend03;

import java.util.Scanner;

public class Arrays {
	
	public static int[] merge(int[] n, int[] m){
		int[] merge = new int[n.length + m.length];
		for (int i = 0; i < merge.length; i++) {
			if(i < n.length){
				merge[i] = n[i];
			} else {
				merge[i] = m[i - n.length];
			}
		}
		return merge;
	}
	
	public static int[] sum(int[] n, int[] m){
		int length = (n.length > m.length)? n.length : m.length;
		int[] a = new int[length];
		for (int i = 0; i < n.length; i++) {
			if(a.length > i){
				a[i] += n[i];
			}
			if(m.length > i){
				a[i] += m[i];				
			}
		}
		return a;
	}
	
	public static boolean sameArrays(int[] n, int[] m){
		if(n.length != m.length){
			return false;
		}
		for (int i = 0; i < n.length; i++) {
			if(n[i] != m[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		
		System.out.print("First array size :  ");
		int firstLength = in.nextInt();
		System.out.print("Second array size : ");
		int secondLength = in.nextInt();
		int[] array1 = new int[firstLength];
		int[] array2 = new int[secondLength];

		
		System.out.println("Enter first array : ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print((i + 1) + ". element: ");
			array1[i] = in.nextInt();
		}

		
		System.out.println("Enter second array:");
		for (int i = 0; i < array2.length; i++) {
			System.out.print((i + 1) + ". element: ");
			array2[i] = in.nextInt();
			
			System.out.println(sameArrays(array1, array2));
			System.out.println(java.util.Arrays.toString(sum(array1, array2 )));
			System.out.println(java.util.Arrays.toString(merge(array1, array2 )));
		}
	}

}
