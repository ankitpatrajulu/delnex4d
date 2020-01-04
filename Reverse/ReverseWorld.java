package com.ankit;

import java.util.Scanner;

public class ReverseWorld {
	
	public static String reverseString2(String str){
		char[] charArr= str.toCharArray();
		int[] n = new int[charArr.length];
		char[] charArr2= new char[charArr.length];
		int j =0;
		/*
		for(int i =0; i<charArr.length;i++){
			if((int)charArr[i]>=65 && (int)charArr[i]<=90){
				n[i]=1;
			}
		}
		*/
		for(int i= (charArr.length)-1;i>=0;i--){
			
				charArr2[j++]=charArr[i];

		}
		
		for(int i =0;i<charArr2.length;i++){
			if( !((int)charArr2[i]>=48 && (int)charArr2[i]<=57)){
				charArr2[i]=(char)((int)charArr2[i]);
			}
		}
		return new String(charArr2);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter the String -> ");
		String string = sc.nextLine();
		Scanner sc2 = new Scanner(string);
		sc2.useDelimiter(" ");
		/*
		String []str3 = string.split(" ");
		
		for(int i=0;i<str3.length;i++){
			System.out.print(reverseString2(sc2.next()+" "));
		}
		*/
		while(sc2.hasNext()){
			System.out.print(reverseString2(sc2.next())+" ");
			
		}
		sc.close();
		sc2.close();
	}

}
