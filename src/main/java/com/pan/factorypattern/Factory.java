package com.pan.factorypattern;

public class Factory {

	public Validator createValidator() {
		return new JsonValidator();
	}

	public Transformer createTransformer(String inputFormat, String outputFormat) {
		return new Json2XmlTransformer();
	}

}
