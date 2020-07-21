package mj.programs.java8_Practice;

import java.util.Scanner;

public class Palindrom {

	public static void  main(String[] args){
		//Input
		Scanner sc= new Scanner(System.in);
		String input = sc.next();
		sc.close();
        //System.out.println("String is palindrom1 " +isPalindrom1(input) );
        System.out.println("String is palindrom method2 " +isPalindrom2(input) );
	}
	
	public static boolean isPalindrom1(String str){
		StringBuilder strBuilder = new StringBuilder(1000);
		for(int j=str.length()-1;j>=0;j--){
			strBuilder.append(str.charAt(j));
		}
		System.out.println("Reverse String " +strBuilder.toString() );
		return str.equals(strBuilder.toString());
	}
	
	public static boolean isPalindrom2(String str){
		int i=0;
		int j = str.length()-1;
		int k = (i+j)/2;
		
		for(int index=i;index<=k;index++){
			if(str.charAt(index)==str.charAt(j)){
				i++;
				j--;
			}else {
				return false;
			}
		}	
		return true;
	}
 }
