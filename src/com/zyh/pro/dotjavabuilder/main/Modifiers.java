package com.zyh.pro.dotjavabuilder.main;

public class Modifiers {

	private final Modifier staticModifier;

	private final Modifier accessModifier;

	private final Modifier finalModifier;

	public Modifiers() {
		staticModifier = new Modifier();
		accessModifier = new Modifier();
		finalModifier = new Modifier();
	}

	public void toStatic() {
		staticModifier.setValue("static");
	}

	public void toFinal() {
		finalModifier.setValue("final");
	}

	public void nonFinal() {
		finalModifier.setNone();
	}

	public void nonStatic() {
		staticModifier.setNone();
	}

	public void toDefault() {
		accessModifier.setNone();
	}

	public void toPrivate() {
		accessModifier.setValue("private");
	}

	public void toProtected() {
		accessModifier.setValue("protected");
	}

	public void toPublic() {
		accessModifier.setValue("public");
	}

	private String getModifierAsText() {
		return accessModifier.toPlainText() +
				staticModifier.toPlainText() +
				finalModifier.toPlainText();
	}

	public String toPlainText() {
		return getModifierAsText() + selfToText();
	}

	protected String selfToText() {
		return "";
	}
}
