package com.pan.wrappers;

public class ThirdPartyValidatorImpl {

	public boolean validate(String input) {
		if (input == null) {
			return false;
		}
		// This is just a demo, right? =D
		return input.startsWith("{") && input.endsWith("}");
	}

}
