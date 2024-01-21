package Annotation2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;
public class test123 {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3,3,4,2,1, 4, 5, 2, 6, 7, 8, 9, 4};
        
        
//
//        Set<Integer> hashSet1 = new HashSet<>(Arrays.asList(intArray));
        System.out.println("HashSet 1: " + new HashSet<>(Arrays.asList(intArray)).toString());
        
   //    System.out.println(Arrays.stream(intArray).map(i->i).collect(Collectors.toSet()));


      
	}

	@Override
	public String toString() {
		return "test123 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
