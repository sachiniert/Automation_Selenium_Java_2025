package ImportantInterviewQuestion;
import java.util.*;

public class ArraySortUsingTreeSet {

	public static void main(String[] args) {
		//Sample Array
		Integer[] numbers = {5,2,8,1,3,9,4};
		
		// TreeSet store elements in natural(ascending ) order
		TreeSet<Integer> ascendingSet = new TreeSet<>();
		ascendingSet.addAll(Arrays.asList(numbers));
		
		System.out.println("Ascending order (TreeSet):"+ascendingSet);
		
		// TreeSet with reverseOrder comparator for descending
		
		 TreeSet<Integer> descendingSet = new TreeSet<>(Collections.reverseOrder());
	     descendingSet.addAll(Arrays.asList(numbers));
	     System.out.println("Descending Order (TreeSet): " + descendingSet);
	}

}
