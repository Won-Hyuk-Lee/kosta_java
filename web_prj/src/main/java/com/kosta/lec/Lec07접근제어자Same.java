package com.kosta.lec;

public class Lec07접근제어자Same {
	public     int samePublicPoint   = 100;
	
	protected  int sameProtectdPoint = 222;
	
               int sameDefaultPoint  = 333;
               
    private    int  samePrivatePoint = 444;	 
    //same.samePrivatePoint = 999;
    		
    public int getSamePrivatePoint() {  //reanOnly
    	return this.samePrivatePoint;
    }
    
}
