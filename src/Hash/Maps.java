package Hash;
import java.util.*;
public class Maps {
	public static void main(String[] args) {
		
		//Hashmap
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Ram");    
	      hm.put(2,"Krishna");    
	      hm.put(3,"Radha");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry t:hm.entrySet()){    
	       System.out.println(t.getKey()+" "+t.getValue());    
	      }
         Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Mike");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Jack");  
	      ht.put(7,"John");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }

	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"David");    
	      map.put(9,"Leo");    
	      map.put(10,"Catherine");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    

}
}
