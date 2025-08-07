package com.palle;

public class ReverseTheWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
	    String[] words = str.split(" ");
	    for(String word: words){
	      String rev = "";
	      for(int i=word.length()-1; i>=0; i--){
	        rev += word.charAt(i);
	      }
	      System.out.print(rev + " ");
	    }
	  }
	


	}


