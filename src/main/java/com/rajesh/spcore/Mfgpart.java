package com.rajesh.spcore;

import org.springframework.stereotype.Component;

@Component("mfg")  //default name for this non qualified , decapitalized value.. i.e. just class name in small caps
public class Mfgpart implements BasePart{
	public void create() {
		System.out.println("Mfg Part created");
		
	}
}
