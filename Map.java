package collection;
import java.util.*;
import java.util.Map.Entry;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linkedHashmap
		HashMap<String,String>marvel=new HashMap<String ,String>();
		 marvel.put("tonystark", "Iron Man");
		 marvel.put("tomholan", "Spider Man");
		 marvel.put("crisvas", "caption America");
		 marvel.put("prabas", "bhaubali");
			System.out.println("the marvel heros:"+marvel);// random order arrange
			System.out.println("after function get ===="+marvel.get("crisvas"));// get value by using key use get();
			
                         // linked hashmap			
 			LinkedHashMap<String,String>cartoon=new LinkedHashMap<String ,String>();
			 cartoon.put("hanuman", " god of all");
			 cartoon.put("benten", "hero time");
			 cartoon.put("goku", " dragonball");
			 cartoon.put("siva", "god of all");
				System.out.println("\nthe marvel heros:"+" ==="+cartoon);//user instruction order (or) print same value for output
				   for(Entry s:cartoon.entrySet()) {
				   }
					   System.out.println(" \n my contain value.......:"+ cartoon.values());// value of the key 
				    System.out.println(" \n my key .......:"+cartoon.keySet());// key set
				   
				   	//tree map
				TreeMap<String,String>root=new TreeMap<String ,String>();
				 root.put("villuparm", "porota");
				 root.put("pettai", "fried rice");
				 root.put("gingee", "idle");
				 root.put("pondcherry", "beach");
		System.out.println("\nthe marvel heros:"+root);

		
					
				
				
	}}

