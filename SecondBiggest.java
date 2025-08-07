package com.palle;

public class SecondBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {10, 20, 30, 40, 50};
		    int max = arr[0];
		    int secondMax = Integer.MIN_VALUE;
		    for(int i=0; i<arr.length; i++){
		      if(arr[i] > max){
		        secondMax = max;
		        max = arr[i];
		      }else if(arr[i] > secondMax && arr[i] != max){
		        secondMax = arr[i];
		      }
		    }
		    System.out.println(secondMax);
		  }
		



	}


