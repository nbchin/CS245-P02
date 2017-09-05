package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public int search(int[] arr, int target) {
		// TODO Auto-generated method stub

		int max = arr.length - 1;
		int min = 0;
		int mid = 0;
		
		while(min <= max){
			mid = (max + min) / 2;
			
			if(arr[mid] == target){
				System.out.println("Target :" + target + ", found");
				return target;
			} 
			if (target < arr[mid]){
				max = mid - 1;
			} 
			if (target > arr[mid]){
				min = mid + 1;
			}
		}

		return -1;
	}

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "Binary Iterative Search";
	}



}
