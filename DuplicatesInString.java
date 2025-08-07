package com.palle;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Hello";
		    for(int i=0; i<str.length(); i++){
		      int count = 0;
		      for(int j=0; j<str.length(); j++){
		        if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)){
		          count++;
		        }
		      }
		      if(count > 1 && i == str.indexOf(str.toLowerCase().charAt(i))){
		        System.out.println(str.charAt(i));
		      }
		    }
		  }
		}

