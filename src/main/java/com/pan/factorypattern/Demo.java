package com.pan.factorypattern;

public class Demo {
	private Factory factory;

	public Demo(Factory factory) {
		this.factory = factory;
	}

	public String fooBar(String input) {
		Validator validator = factory.createValidator();
		boolean isValid = validator.validate(input);
		if (!isValid) {
			return "ERROR: Invalid input.";
		}
		String changedData = doSomeStuff(input);
		Transformer transformer = factory.createTransformer(Config.inputFormat, Config.outputFormat);
		String formattedData = transformer.transform(changedData);
		return formattedData;
	}

	private String doSomeStuff(String input) {
		return "{ChangedData}";
	}

	public static void main(String[] args) {
		new Demo(new Factory());
	}

}