package com.zyh.pro.dotjavabuilder.main;

public class AssignOperation extends ValuePlainText {
	@Override
	protected String toTextWithValue(String value) {
		return "=" + value;
	}
}
