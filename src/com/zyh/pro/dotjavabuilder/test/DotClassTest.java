package com.zyh.pro.dotjavabuilder.test;

import com.zyh.pro.dotjavabuilder.main.DotClass;
import com.zyh.pro.dotjavabuilder.main.DotField;
import com.zyh.pro.dotjavabuilder.main.Modifiers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DotClassTest {
	@Test
	public void addField() {
		Modifiers modifiers = new Modifiers();
		DotClass dotClass = new DotClass(modifiers, "MyClass");
		dotClass.add(new DotField(new Modifiers(), "Integer", "aField"));
		dotClass.add(new DotField(new Modifiers(), "Integer", "field2"));
		dotClass.add(new DotClass(new Modifiers(), "InnerClass"));
		assertThat(dotClass.toPlainText(), is("class MyClass{Integer aField;Integer field2;class InnerClass{}}"));
	}

	@Test
	public void init() {
		DotClass dotClass = new DotClass(new Modifiers(), "MyClass");
		assertThat(dotClass.toPlainText(), is("class MyClass{}"));
	}
}
