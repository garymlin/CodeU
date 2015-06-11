
public class Filter {

	public static int[] evens(int[] input){
		//go through and find out how many evens there are
		int counter = 0;
		for (int i = 0 ; i < input.length; i++){
			if(input[i] % 2 == 0){
				counter++;
			}
		}
		
		//make an index counter and the result array
		int index = 0;
		int[] result = new int[counter];
		for (int j = 0; j < input.length; j++){
			if(input[j] % 2 == 0){
				result[index++] = input[j];
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {8,6,7,5,3,0,9};
	    int[] ans = evens(test1);
	    System.out.println("test1 results:");
	    for (int i = 0; i < ans.length; ++i) {
	      System.out.println(ans[i]);
	    }
	    int [] test2 = {2,7,18,28,18,28,45,90,45};
	    ans = evens(test2);
	    System.out.println("test2 results:");
	    for (int i = 0; i < ans.length; ++i) {
	      System.out.println(ans[i]);
	    }


	}

}
