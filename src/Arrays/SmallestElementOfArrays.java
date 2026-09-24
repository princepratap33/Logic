package Arrays;

public class SmallestElementOfArrays {

	public static void main(String[] args) {
		
		int[] arr = {10, 25, 5, 40, 15};
		
		int smallest = arr[0];
		
		for(int i = 0; i < arr.length ; i++) {
			
			if(arr[i] < smallest ) {
				
				smallest = arr[i];
			}
		}
		System.out.println(smallest);

	}

}
