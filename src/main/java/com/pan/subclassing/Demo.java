package com.pan.subclassing;

public abstract class Demo {

	public String fooBar(String input) {
		Validator validator = getValidator();
		boolean isValid = validator.validate(input);
		if (!isValid) {
			return "ERROR: Invalid input.";
		}
		String changedData = doSomeStuff(input);
		Transformer transformer = getTransformer(Config.inputFormat, Config.outputFormat);
		String formattedData = transformer.transform(changedData);
		return formattedData;
	}

	private String doSomeStuff(String input) {
		return "{ChangedData}";
	}

	protected abstract Validator getValidator();

	protected abstract Transformer getTransformer(String inputFormat, String outputFormat);

}
