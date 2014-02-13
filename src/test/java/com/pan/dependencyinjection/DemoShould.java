package com.pan.dependencyinjection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DemoShould {

	@Test
	public void changeValidInputAndTransformFromJsonToXml() {
		Demo demo = new Demo(new JsonValidator(), new Json2XmlTransformer());
		String validInput = "{\"A valid json key\":\"A valid json value\"}";
		String result = demo.fooBar(validInput);
		assertEquals("<ChangedData>", result);
	}

}
