package com.senpiper.demo.entities;
import java.util.Arrays;
import java.util.List;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;


@Converter
public class stringToListConverter implements 
AttributeConverter<List<String>,String> {
	
	
	private static String splitChar = ",";

	@Override
	public String convertToDatabaseColumn(List<String> attribute) {
		// TODO Auto-generated method stub
		return String.join(splitChar, attribute);
	}

	@Override
	public List<String> convertToEntityAttribute(String dbData) {
		// TODO Auto-generated method stub
		return Arrays.asList(dbData.split(splitChar));
	}
	
	

}
