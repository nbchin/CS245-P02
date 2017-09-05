package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {

	@Override
	public int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				System.out.println("Target Found");
				return target;
			}
		}
		
		return -1;
	}

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "Linear Search";
	}


}
