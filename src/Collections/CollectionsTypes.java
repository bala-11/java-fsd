package Collections;
import java.util.*;
public class CollectionsTypes {

	public static void main(String[] args) {
		//creating arraylist
		
		System.out.println("ArrayList");
		ArrayList<String> name =new ArrayList<String>();   
	      name.add("Ram");    	   
	      System.out.println(name);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      @SuppressWarnings({ "unchecked", "rawtypes" })
		Vector<Integer> vec = new Vector();
	      vec.addElement(10); 
	      vec.addElement(20); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Ram");  
	      names.add("Krishna");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>();  
	       set1.add(11);  
	       set1.add(13);  
	       set1.add(12);
	       set1.add(14);	       
	       System.out.println(set1);
	      	} 
	      }  
	}

