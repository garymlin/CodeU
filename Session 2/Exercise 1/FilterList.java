import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FilterList {

	public static List<Integer> evens(List<Integer> input) {
		//create result array
		List<Integer> result = new ArrayList<Integer>();
		
		//add only even numbers
		for (int i = 0; i < input.size() ; i++){
			if (input.get(i) % 2 == 0){
				result.add(input.get(i));
			}
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> test1 =
	            new ArrayList<Integer>(Arrays.asList(8,6,7,5,3,0,9));
        List<Integer> ans = evens(test1);
        // Expected output: 8, 6, 0
        for (Integer n: ans) {
            System.out.print(Integer.valueOf(n) + ", ");
        }
        System.out.println();

        List<Integer> test2 =
            new ArrayList<Integer>(Arrays.asList(2,7,18,28,18,28,45,90,45));
        ans = evens(test2);
        // Expected output: 2, 18, 28, 18, 28, 90
        for (Integer n: ans) {
            System.out.print(Integer.valueOf(n) + ", ");
        }
        System.out.println();


	}

}
