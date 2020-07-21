package mj.programs.java8_Practice;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Java8Map1 {
	   public static void main(String []argh)
	   {   
		   //Java 7 
		   Map<String, Integer> items = new HashMap<String, Integer> ();
			items.put("A", 10);
			items.put("B", 20);
			items.put("C", 30);
			items.put("D", 40);
			items.put("E", 50);
			items.put("F", 60);

			for (Map.Entry<String, Integer> entry : items.entrySet()) {
				System.out.println("Item Using Java 7: " + entry.getKey() + " Count : " + entry.getValue());
			}
			
			for(Map.Entry<String, Integer> ent : items.entrySet()){
				String key = ent.getKey();
				int value = ent.getValue();
				System.out.println("Maps in Java7 " + key + " " + value);
			}
           //Java 8 
		   Map<String, Integer> items2 = new HashMap<String, Integer> ();
			items2.put("A", 10);
			items2.put("B", 20);
			items2.put("C", 30);
			items2.put("D", 40);
			items2.put("E", 50);
			items2.put("F", 60);
			
			items2.forEach((k,v)->System.out.println("Items using Java 8 : " + k + " Count : " + v));
		    items2.forEach((m,n)-> System.out.println("Items using Java 8 : " + m + " Count : " + n));
					
			items2.forEach((k,v)->{
				System.out.println("Item using Java 8: " + k + " Count : " + v);
				if("E".equals(k)){
					System.out.println("Hello E");
				}
			});
			
			//Stream.of(items2).allMatch(predicate)

}
}

	