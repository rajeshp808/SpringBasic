package com.rajesh.spcore;

import org.springframework.stereotype.Component;

@Component(value = "eng")
public class Engpart implements BasePart {

	public void create() {
		System.out.println("Eng Part created");
		
	}

}
