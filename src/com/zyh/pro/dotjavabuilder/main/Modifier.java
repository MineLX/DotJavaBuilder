package com.zyh.pro.dotjavabuilder.main;

public class Modifier extends ValuePlainText {
	@Override
	protected String toTextWithValue(String value) {
		return value + " ";
	}
}
