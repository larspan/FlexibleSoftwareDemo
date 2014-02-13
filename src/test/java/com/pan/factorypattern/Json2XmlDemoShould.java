package com.pan.factorypattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Json2XmlDemoShould {

	@Test
	public void changeValidInputAndTransformFromJsonToXml() {
		Demo demo = new Demo(new Factory());
		String validInput = "{\"A valid json key\":\"A valid json value\"}";
		String result = demo.fooBar(validInput);
		assertEquals("<ChangedData>", result);
	}

}
