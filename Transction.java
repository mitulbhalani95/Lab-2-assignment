package com.mitul.lab2;

import java.util.Scanner;

public class Transction {
	
	
	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the size of transction arry");
		
		int size = s.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter the value of arry");
		
		for (int i =0; i<size;i++) {
			 
			arr[i] = s.nextInt();
		}
		
		System.out.println("enter the total numbers of target that needs to be achived");
		int targetNo = s.nextInt();
		
		while (targetNo-- !=0) {
			
			int flag=0;
			long target;
			System.out.println("enter the value of target");
			target = s.nextInt();
			
			long sum = 0;
			
			for(int i=0; i<size;i++) {
				sum += arr[i];
			
				if(sum>=target) {
					System.out.println("Target achived after " +(i +1)+ " transction");
					flag=1;
					break;
				}

			}
			
			if(flag==0) {
				System.out.println("given target is not achived");
			}
			
		}
		
		

}
}