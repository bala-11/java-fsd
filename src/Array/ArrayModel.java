package Array;
import java.util.*;
@SuppressWarnings("unused")
public class ArrayModel {

	public static void main(String[] args) {
		//single dimensional Array
		
		int a[] = {0,1,2,3,4,5,6,7,8,9};
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//two dimensional array
		int b[][]= {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}};
		System.out.println("Length of the arrays");
		System.out.println(b[0].length +"  "+b[1].length);
	}

}
