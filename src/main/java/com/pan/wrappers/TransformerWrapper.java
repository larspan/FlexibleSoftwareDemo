package com.pan.wrappers;

public class TransformerWrapper {
	private final ThirdPartyTransformerImpl impl;

	public TransformerWrapper(String inputFormat, String outputFormat) {
		impl = new ThirdPartyTransformerImpl(inputFormat, outputFormat);
	}

	public String transform(String changedData) {
		return impl.transform(changedData);
	}
}