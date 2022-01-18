package com.rajesh.spcore;

import org.springframework.stereotype.Component;

//@Component("mat")    // commented as direct bean is declared in xml instead of annotation config 
public class Material {
	
	private String supplier;
	
	public Material() {
		
	}
	
	public Material(String supplier) {
		super();
		this.supplier = supplier;
	}

	public String getSupplier() {
		supplier=supplier+" END";
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	@Override
	public String toString() {
		return "Material [supplier=" + supplier + "]";
	}

	
}
