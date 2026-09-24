package Arrays;

public class LargElementOfArrays {

	public static void main(String[] args) {
		
		int[] arr = {10, 25, 5, 40, 15};
		
		int large = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > large) {
				
				large = arr[i];
			}
		}
		
		System.out.println(large);

	}

}
