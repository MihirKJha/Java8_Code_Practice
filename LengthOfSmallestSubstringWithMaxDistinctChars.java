package mj.programs.java8_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LengthOfSmallestSubstringWithMaxDistinctChars {
	
	public static void  main(String[] args){ 
	Scanner scan = new Scanner(System.in);
    String s= scan.next();
    scan.close();
    List<String> strList = new ArrayList<>();
    Map<String,Integer> strMap= new HashMap<>();
    
    for(int i=1;i<s.length()-1;i++){    	
    	strList.add(s.substring(0, i));
    	
    }
    
   for(String st:strList){
	   strMap.put(st, checkUniqueCharInString(st));
   }
   
   
 }
	
  
	static int checkUniqueCharInString(String inStr){
	String temp="";
	
	for(int i=0;i<inStr.length();i++){
		if(temp.indexOf(inStr.charAt(i))==-1){
			temp=temp+inStr.charAt(i);
		}
	}
	
	return temp.length();
  }
}
