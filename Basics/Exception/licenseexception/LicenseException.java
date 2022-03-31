package com.tyss.corejava.Exception.licenseexception;

public class LicenseException extends RuntimeException {
	public LicenseException(String msg) {  
		super(msg); // Constructor Chaining RuntimeException -> Exception -> Throwable (getMessage)
	}

}
