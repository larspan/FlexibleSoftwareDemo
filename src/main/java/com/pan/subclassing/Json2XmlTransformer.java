package com.pan.subclassing;

public class Json2XmlTransformer implements Transformer {

	@Override
	public String transform(String input) {
		// You only need to replace "{" with "<" and "}" with ">" in order to
		// convert JSON to XML. Everyone knows that. ;)
		input = input.replace("{", "<");
		return input.replace("}", ">");
	}

}
