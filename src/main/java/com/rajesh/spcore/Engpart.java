package com.rajesh.spcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//For Component, below value added is eng, default name for this non qualified , decapitalized value.. i.e. just class name in small caps
@Component(value = "eng")  
public class Engpart implements BasePart {
	
	/** this autowired annotation will create us the Material instance automatically based on xml config
	*/
	@Autowired
	private Material matsup;   
	
	
	 public Material getMatsup() {
		 return matsup; 
		 }
	  
	  public void setMatsup(Material matsup) { 
		  this.matsup = matsup; 
	}
	 

	public void create() {
		System.out.println("Eng Part created with "+matsup);
		
	}

}
