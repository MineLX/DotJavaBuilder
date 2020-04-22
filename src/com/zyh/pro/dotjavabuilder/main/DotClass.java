package com.zyh.pro.dotjavabuilder.main;

import java.util.ArrayList;
import java.util.List;

public class DotClass implements PlainText {

	private String className;

	private final Modifiers modifiers;

	private final List<PlainText> inners;

	public DotClass(Modifiers modifiers, String className) {
		this.modifiers = modifiers;
		this.className = className;

		inners = new ArrayList<>();
	}

	@Override
	public String toPlainText() {
		return modifiers.toPlainText() + ("class " + className + "{" + getInnerAsText() + "}");
	}

	private String getInnerAsText() {
		return inners.stream()
				.map(PlainText::toPlainText)
				.reduce("", (one, another) -> one + another);
	}

	public void add(PlainText plainText) {
		inners.add(plainText);
	}
}
