package com.jkl.refaster;

public class StringIsEmptyTemplate {
	
	@BeforeTemplate
	boolean equalsEmptyString(String string) {
		return string.equals("");
		
	}
	
	@BeforeTemplate	
	boolean lengthEqualsZero(String string) {
		return string.length() == 0;
		
	}
	
	@AfterTemplate	
	boolean lengthEqualsZero(String string) {
		return string.length() == 0;
		
	}

}
