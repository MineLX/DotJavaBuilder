package com.zyh.pro.dotjavabuilder.test;

import com.zyh.pro.dotjavabuilder.main.Modifiers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ModifiersTest {
	@Test
	public void toFinal() {
		Modifiers modifiers = initElement();
		modifiers.toFinal();
		assertThat(modifiers.toPlainText(), is("final "));
		modifiers.nonFinal();
		assertThat(modifiers.toPlainText(), is(""));
	}

	@Test
	public void toStatic() {
		Modifiers modifiers = initElement();
		modifiers.toStatic();
		assertThat(modifiers.toPlainText(), is("static "));
		modifiers.nonStatic();
		assertThat(modifiers.toPlainText(), is(""));
	}

	@Test
	public void toPublic() {
		Modifiers modifiers = initElement();
		modifiers.toPublic();
		assertThat(modifiers.toPlainText(),
				is("public "));
		modifiers.toPrivate();
		assertThat(modifiers.toPlainText(),
				is("private "));
		modifiers.toProtected();
		assertThat(modifiers.toPlainText(),
				is("protected "));
		modifiers.toDefault();
		assertThat(modifiers.toPlainText(),
				is(""));
	}

	@Test
	public void init() {
		assertThat(initElement().toPlainText(),
				is(""));
	}

	private Modifiers initElement() {
		return new Modifiers();
	}
}
