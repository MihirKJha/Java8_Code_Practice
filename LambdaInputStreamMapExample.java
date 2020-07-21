package mj.programs.java8_Practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInputStreamMapExample {

	public static void main(String[] args) {
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D://FileUpload.txt")))) {
			
			List<String> sList = reader.lines()
					.map(LambdaInputStreamMapExample::parseTokens)
					.flatMap(x->x.stream()).sorted(Comparator.naturalOrder())
					.collect(Collectors.toList());
			sList.forEach(System.out::println);
						    
			
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}

	}
	
	private static List<String> parseTokens(String str) {
		String[]  parsedArray= str.trim().split("[\\s,;]+");
		//String[]  parsedArray= StringUtils.split(str, "\\,\\; ");
		return Arrays.asList(parsedArray)
				.stream().map(s->s.trim())
				.collect(Collectors.toList());        
	}
 }
