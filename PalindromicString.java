package mj.programs.java8_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PalindromicString {
	
	public static void  main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String S = br.readLine();
        List<Integer> ans = new ArrayList<>(); 
        ans = solve(N, S);
        for(int i=0;i<ans.size();i++) 
        {
            System.out.print(ans.get(i));
            if(i==(int)ans.size()-1) System.out.println();
            else System.out.print(" ");
        }
        wr.close();
        br.close();
    }
    static List<Integer> solve(int N, String S){
        //Your code goes here 
        List<String> prefixList = new ArrayList<>();
        List<Integer> maxPalindromLengths = new ArrayList<>();
        for(int index=1;index<N+1;index++){
            prefixList.add(S.substring(0,index));
         }
         
         for(String prefix : prefixList){
             
             if(checkForPalindrom(prefix)) {
                 
                  maxPalindromLengths.add(prefix.length());
                  
             } else {
                 
                  for(int m=prefix.length()-1;m>0;m--) {
                       
                       List<String> foundStrings = findAllSubstringForGivenLength(prefix,m);
                       if(checkForPalindrom(foundStrings)){
                           maxPalindromLengths.add(m);
                           break;
                       }
                 }
             } 
                
         }
        maxPalindromLengths.stream().sorted(Comparator.reverseOrder()); 
        return maxPalindromLengths;
    }
    
     static List<String> findAllSubstringForGivenLength(String S, int n){
       Matcher m = Pattern.compile("([a-zA-Z]){"+ n + "}").matcher(S);
       List<String> foundStrings = new ArrayList<>();
       for (int i = 0; m.find(i); i = m.start() + 1) {
         foundStrings.add(m.group());
      }
      return foundStrings;
    }
    
    static boolean checkForPalindrom(List<String> str){
        for(String s: str){
            if(checkForPalindrom(s)) return true;
         }
         
         return false;
    }
    
     static boolean checkForPalindrom(String S){
        int k = S.length()/2;
        int length = S.length();
       
        for(int i=0;i<k;i++){
            if(S.charAt(i)!=S.charAt(length-i-1)){
                return false;
            }
         }
         
         return true;
    }
    
}