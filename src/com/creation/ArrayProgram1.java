//Program to copy all elements of one array into another array

package com.creation;

public class ArrayProgram1 {
	public static void main(String[] args) {
		int a[] = new int []{1,2,3,4,5};
		
		int b[]= new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("Original Elements " );
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Copied Element ");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
