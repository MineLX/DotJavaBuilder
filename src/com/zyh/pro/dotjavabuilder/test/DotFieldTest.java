package com.zyh.pro.dotjavabuilder.test;

import com.zyh.pro.dotjavabuilder.main.DotField;
import com.zyh.pro.dotjavabuilder.main.Modifiers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DotFieldTest {
	@Test
	public void initValue() {
		Modifiers modifiers = new Modifiers();
		DotField dotField = initDotField(modifiers);
		dotField.setInitValue("6");
		assertThat(dotField.toPlainText(), is("Integer aField=6;"));
	}

	@Test
	public void toFinal() {
		Modifiers modifiers = new Modifiers();
		DotField dotField = initDotField(modifiers);
		modifiers.toFinal();
		assertThat(dotField.toPlainText(), is("final Integer aField;"));
		modifiers.nonFinal();
		assertThat(dotField.toPlainText(), is("Integer aField;"));
	}

	@Test
	public void toStatic() {
		Modifiers modifiers = new Modifiers();
		DotField dotField = initDotField(modifiers);
		modifiers.toStatic();
		assertThat(dotField.toPlainText(), is("static Integer aField;"));
		modifiers.nonStatic();
		assertThat(dotField.toPlainText(), is("Integer aField;"));
	}

	@Test
	public void toPublic() {
		Modifiers modifiers = new Modifiers();
		DotField dotField = initDotField(modifiers);
		modifiers.toPublic();
		assertThat(dotField.toPlainText(),
				is("public Integer aField;"));
		modifiers.toPrivate();
		assertThat(dotField.toPlainText(),
				is("private Integer aField;"));
		modifiers.toProtected();
		assertThat(dotField.toPlainText(),
				is("protected Integer aField;"));
		modifiers.toDefault();
		assertThat(dotField.toPlainText(),
				is("Integer aField;"));
	}

	@Test
	public void init() {
		assertThat(initDotField(new Modifiers()).toPlainText(),
				is("Integer aField;"));
	}

	private DotField initDotField(Modifiers modifiers) {
		return new DotField(modifiers, "Integer", "aField");
	}
}
