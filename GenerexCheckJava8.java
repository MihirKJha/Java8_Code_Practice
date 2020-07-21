package mj.programs.java8_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import com.mifmif.common.regex.Generex;

/**
 * 	X	=	Uppercase letters (A - Z)---->\p{Upper}
	H	=	Hexadecimal digits (1 - 9, A - F) ---> \p{XDigit} 	A hexadecimal digit: [0-9a-fA-F]
	9	=	Digits (1 - 9)---> \d
 	*	=	Uppercase letters or digits -- Need to check
	\	=	Escape character
 */
public class GenerexCheckJava8 {
	
public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	 String promoTemplate = scan.next();
	 int maxPromoCodeCount = scan.nextInt();
	 int oneTimePromoCodeTracker =0;
	 scan.close();
	 StringBuilder regularExpTemplateBuilder = new StringBuilder(1000);
     char[] templateArray =promoTemplate.toCharArray();
	 
	 List<String> generatedPromoList =new ArrayList<>();
     List<String> PromoList =new ArrayList<>();
     PromoList.add("PROMO_MJ_123");
     PromoList.add("PROMO_MJ_1234");
     PromoList.add("PROMO_MJ_1235");
     PromoList.add("PROMO_MJ_1234");
     PromoList.add("PROMO_MJ_1235");
     PromoList.add("PROMO_MJ_1232");
   
    if(StringUtils.isBlank(promoTemplate)){
    	 System.out.println("Pattern is Blank, it is impossible to generate more then one Promo Code.");
    	 System.exit(1);
     }
    
    if(maxPromoCodeCount <=0) {
    	System.out.println("One Time Promo Code count Can not be less than or equal to zero");
   	    System.exit(1);
    }
    
    if(!StringUtils.containsAny(promoTemplate,"XxHh9*")){
    	 System.out.println("Pattern has only raw characters, it is impossible to generate more then one Promo Code.");
    	 System.exit(1);
     }
    
    for(int i = 0; i < templateArray.length; i++){
		 char ch = templateArray[i];
    	 switch (ch) {
    	 	case '\\':	
    	 		regularExpTemplateBuilder.append(templateArray[++i]);
    	 		break;
    	 	case 'x':
    	 	case 'X':
    	 		regularExpTemplateBuilder.append("[A-Z]");
    	 		break;
    	 	case 'h':
    	 	case 'H':	
    	 		regularExpTemplateBuilder.append("[1-9A-F]");
    	 		break;
    	 	case '*':	
    	 		regularExpTemplateBuilder.append("[0-9A-F]");
    	 		break;
    	 	case '9':	
    	 		regularExpTemplateBuilder.append("\\d");
    	 		break;
    	 	default:
    	 		regularExpTemplateBuilder.append(ch);
    	 		break;
		}
    	
     }
    
     System.out.println("String constructed after Regular Expression manipulations " + regularExpTemplateBuilder.toString());
     
     Generex generex = new Generex(regularExpTemplateBuilder.toString());
     
     while ((oneTimePromoCodeTracker < maxPromoCodeCount)) {
         String randomStr = generex.random();
         if (!PromoList.contains(randomStr)) {
        	 generatedPromoList.add(randomStr);
        	 oneTimePromoCodeTracker++;
         }
     }	 
     generatedPromoList.forEach(System.out::println);
     
	}
}