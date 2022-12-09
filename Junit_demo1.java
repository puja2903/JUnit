package com.demo.main;

public class Junit_demo1 {
	public static int max(int[]arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<=arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
}
