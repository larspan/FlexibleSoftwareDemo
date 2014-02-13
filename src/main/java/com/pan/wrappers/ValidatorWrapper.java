package com.pan.wrappers;

public class ValidatorWrapper {
	private ThirdPartyValidatorImpl impl = new ThirdPartyValidatorImpl();

	public boolean validate(String input) {
		return impl.validate(input);
	}
}
