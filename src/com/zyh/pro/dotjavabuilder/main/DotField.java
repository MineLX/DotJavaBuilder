package com.zyh.pro.dotjavabuilder.main;

public class DotField implements PlainText {

	private static final String TERMINATOR = ";";

	private final String typeName;

	private final String fieldName;

	private final Modifiers modifiers;

	private final AssignOperation initValueOperand;

	public DotField(Modifiers modifiers, String typeName, String fieldName) {
		this.typeName = typeName;
		this.fieldName = fieldName;
		this.modifiers = modifiers;
		initValueOperand = new AssignOperation();
	}

	@Override
	public String toPlainText() {
		return modifiers.toPlainText() + typeName + " " + fieldName + initValueOperand.toPlainText() + TERMINATOR;
	}

	public void setInitValue(String initValue) {
		initValueOperand.setValue(initValue);
	}
}
