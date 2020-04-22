package com.zyh.pro.dotjavabuilder.main;

public abstract class ValuePlainText {
	private String value;

	public void setValue(String value) {
		this.value = value;
	}

	public void setNone() {
		value = null;
	}

	public String toPlainText() {
		if (value != null)
			return toTextWithValue(value);
		return "";
	}

	protected abstract String toTextWithValue(String value);
}
