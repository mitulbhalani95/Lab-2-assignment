package com.mitul.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Currency {
	
	public static void main(String[] args) {
		
		Msort m = new Msort();
		
	 
		NotesCount notesCount = new NotesCount();

		System.out.println("enter the currency denomination");
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] notes = new int[size];
		
		System.out.println("enter the currency denomination value");
		
		for(int x=0;x<size;x++) {
			notes[x]=sc.nextInt();
			
		}
		
		
		
		System.out.println("enter the amount you want to pay");
		int amount=sc.nextInt();
		
		//m.mSort(notes,0,notes.length-1);
		
		notesCount.notesCountImplimentation(notes,amount);
		
		
		System.out.println("your payment approch in order to give minimum coin is");
		
		
		
		 
	}

}
