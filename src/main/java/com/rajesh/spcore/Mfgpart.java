package com.rajesh.spcore;

import org.springframework.stereotype.Component;

@Component("mfg")
public class Mfgpart implements BasePart{
	public void create() {
		System.out.println("Mfg Part created");
		
	}
}
