
public class Zip {

	static boolean[] join (int[] x , int[] y){
		//get the min size of two arrays and make another array of that size
		int size = Math.min(x.length, y.length);
		boolean[] result = new boolean[size];
		
		//loop through the smallest array and check for divisibility
		for (int i = 0 ; i < size; i++){		
			//can't divide by 0, so check if y[i] is 0
			if( y[i] != 0 && x[i] % y[i] == 0){
				result[i] = true;
			}
			
			else{
				result[i] = false;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int euler[] = {2, 7, 18, 28, 18, 28, 45, 90, 45};
	    int jenny[] = {8, 6, 7, 5, 3, 0, 9};
	    boolean divisibles[] = join(euler, jenny);
	    for (int i = 0; i < divisibles.length; ++i) {
	      System.out.println(divisibles[i]);
	    }


	}

}
