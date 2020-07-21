package mj.programs.java8_Practice;

/**
 * 
 * @author Mihir
 *
 */
public class FindFirstEvenLengthStringInAGivenLargeStringInPlaceAlgo {

	public static void main(String[] args) {
		System.out.println("Max Even Length String in given String ----> " + getFirstEvenLengthString("My name is Java and I am and Jhones superb") + " ---with length --" +
				getFirstEvenLengthString("My name is Java and I am and Jhones superb").length());

	}
   
	public static String getFirstEvenLengthString(String s){
		int maxLength=-1;
		String largestEvenString=null;
		String[] strSplit = s.split(" "); 
		for(String str:strSplit){
			if(str.length()%2==0){
				if(str.length()>maxLength){
					maxLength=str.length();
					largestEvenString=str;
				}
			}
		}
		
		return largestEvenString;
		
	}
}
