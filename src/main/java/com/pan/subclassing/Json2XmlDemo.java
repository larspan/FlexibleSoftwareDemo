package com.pan.subclassing;

public class Json2XmlDemo extends Demo {

	@Override
	protected Validator getValidator() {
		return new JsonValidator();
	}

	@Override
	protected Transformer getTransformer(String inputFormat, String outputFormat) {
		if ("JSON".equals(inputFormat) && "XML".equals(outputFormat)) {
			return new Json2XmlTransformer();
		}
		return null;
	}

}
