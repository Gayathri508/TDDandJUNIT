package com.epam.TddandJunit;

public class RemoveA {

	public String delete(String s) {
		// TODO Auto-generated method stub
	       s.toUpperCase();
	       String s1="";
	       if(s.length()==1 && s.charAt(0)!='A'){
	           s1=s;
	       }
	       if(s.length()>1){
	       if(s.charAt(0)=='A' &&s.charAt(1)=='A') {
	            s1=s1+s.substring(2,s.length());
	        }
	        else if(s.charAt(0)=='A') {
	            s1=s1+s.substring(1,s.length());
	        }
	        else if(s.charAt(1)=='A') {
	            s1=s.charAt(0)+s.substring(2,s.length());
	        }
	        else{
	            s1=s;
	        }
	       }
	        
	         return s1;
	}

}
