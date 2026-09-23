package LOGIC_BUILDING;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int num = 26;
		
		boolean isPrime = true;
		
		if (num <=1 ) {
			isPrime = false;
			
		}else {
			for (int i = 2 ; i < num ; i++) {
				 if ( num % 2 == 0) {
					 
					 isPrime = false;
				 }
			}
		}
		
		if(isPrime) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}

	}

}
