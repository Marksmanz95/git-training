package com.assignment.function;

public class Assignment1 {
	public static void main(String[] args) {
		System.out.println(sum(3));
	}
	public static int sum(int n){
		int result=0;
		for(int i=1;i<=n;i++){
			result=result+i;
		}
		return result;
	}
}
