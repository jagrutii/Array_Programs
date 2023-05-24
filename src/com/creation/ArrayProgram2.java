//Program to find the frequency of each element in the array
package com.creation;

public class ArrayProgram2 {
	public static void main(String[] args) {
		int a[] = new int [] {1,1,4,4,4,8,9,8,0};
		int b[]= new int[a.length];
		
		int visited = -1;
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=visited;
				}
			}
			if(b[i]!= visited) {
				b[i]=count;
			}
		}
		System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i=0;i<b.length;i++) {
        	if(b[i]!=visited) {
        	System.out.println("  "+a[i]+ " | "  +b[i]);
        	}
        }
	}
}
