package com.pan.wrappers;

public class Demo {
	public String fooBar(String input) {
		ValidatorWrapper validator = new ValidatorWrapper();
		boolean isValid = validator.validate(input);
		if (!isValid) {
			return "ERROR: Invalid input.";
		}
		String changedData = doSomeStuff(input);
		TransformerWrapper transformer = new TransformerWrapper(Config.inputFormat, Config.outputFormat);
		String formattedData = transformer.transform(changedData);
		return formattedData;
	}

	private String doSomeStuff(String input) {
		return "{ChangedData}";
	}
}
