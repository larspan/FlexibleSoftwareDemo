package com.pan.subclassing;

public class XmlValidator implements Validator {

	@Override
	public boolean validate(String input) {
		if (input == null) {
			return false;
		}
		// This is just a demo, right? =D
		return input.startsWith("<") && input.endsWith(">");
	}

}
