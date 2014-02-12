package com.pan.subclassing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Json2XmlDemoShould {

	@Test
	public void changeValidInputAndTransformFromJsonToXml() {
		Demo demo = new Json2XmlDemo();
		String validInput = "{\"A valid json key\":\"A valid json value\"}";
		String result = demo.fooBar(validInput);
		assertEquals("<ChangedData>", result);
	}

}
