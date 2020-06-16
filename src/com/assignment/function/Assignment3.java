package com.assignment.function;

public class Assignment3 {
	public static void main(String[] args) {
		Integer[] arr = {5,3,1,9,2,4};
		System.out.println("Minimun is "+minimum(arr));
		System.out.println("Average is "+average(arr));
		System.out.println("Maximum is "+maximum(arr));
		
	}
	public static int minimum(Integer[] arr){
		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(min<arr[i]){
				min=arr[i];
			}
		}
		
		return min;
	}
	public static int average(Integer[] arr){
		int result = 0;
		for(int i=0;i<arr.length;i++){
			result = result + arr[i];
		}
		result = result/arr.length;
		return result;
	}
	public static int maximum(Integer[] arr){
		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(max>arr[i]){
				max=arr[i];
			}
		}
		
		return max;
	}
}
