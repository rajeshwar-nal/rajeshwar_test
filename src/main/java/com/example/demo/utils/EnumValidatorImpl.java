package com.example.demo.utils;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnumValidatorImpl implements ConstraintValidator<EnumValidator, String> {

	List<ContainerTypeEnum> valueList = Arrays.asList(ContainerTypeEnum.values());

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return valueList.contains(value.toUpperCase());
	}

}