package com.pan.dependencyinjection;

public class Demo {
	private final Validator validator;
	private final Transformer transformer;

	public Demo(Validator validator, Transformer transformer) {
		this.validator = validator;
		this.transformer = transformer;
	}

	public String fooBar(String input) {
		boolean isValid = validator.validate(input);
		if (!isValid) {
			return "ERROR: Invalid input.";
		}
		String changedData = doSomeStuff(input);
		String formattedData = transformer.transform(changedData);
		return formattedData;
	}

	private String doSomeStuff(String input) {
		return "{ChangedData}";
	}

	public static void main(String[] args) {
		new Demo(new JsonValidator(), new Json2XmlTransformer());
	}
}