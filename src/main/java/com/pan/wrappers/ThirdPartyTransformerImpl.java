package com.pan.wrappers;

public class ThirdPartyTransformerImpl {

	public ThirdPartyTransformerImpl(String inputFormat, String outputFormat) {
	}

	public String transform(String input) {
		input = input.replace("{", "<");
		return input.replace("}", ">");
	}

}
