package com.lao.javaLearning;

public class Certificate {
 public String finalCertificate="provosional";
 public String collectCertificate() {
	 System.out.println(" Go and collect" + finalCertificate + "\tsheet ");
	 return finalCertificate;
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Certificate mom= new Certificate();
		String certificateMessage= mom.collectCertificate();
		System.out.println("i Got my certificate" + certificateMessage);
		
		
		
	}	
		
	}

