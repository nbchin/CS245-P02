package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {
	
	private int globalTarget = 0;

	@Override
	public int search(int[] arr, int target) {
		globalTarget = target;
		return search(arr, target, 0, arr.length - 1);
	}
	
	protected int search(int[] arr, int target, int min, int max){
		
		if(max < min){
			return -1;
		} 
		int midArray = (max + min) / 2;
			
		if(arr[midArray] == target){
			System.out.println("Target found");
			return target;
		} else if (target < arr[midArray]){	
			return search(arr, target, min, midArray - 1);
		} else {			
			return search(arr, target, midArray + 1, max);
		} 
		
	
	}

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		
		return "Binary Recursive Search"
				+ "\nTarget = " + globalTarget + "\n";
		/*Example Return: 
		 * Array size  = 2500000
		Searches    = 100000
		Search type = binary-iterative
		null: total search time = 4ms. Average search time = 1.6E-6ms.
		 */
	}


	

}
