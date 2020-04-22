package com.zyh.pro.dotjavabuilder.test;

import com.zyh.pro.dotjavabuilder.main.Modifier;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ModifierTest {
	@Test
	public void setNone() {
		Modifier modifier = new Modifier();
		modifier.setValue("static");
		assertThat(modifier.toPlainText(), is("static "));
		modifier.setNone();
		assertThat(modifier.toPlainText(), is(""));
	}

	@Test
	public void setName() {
		Modifier modifier = new Modifier();
		assertThat(modifier.toPlainText(), is(""));
		modifier.setValue("static");
		assertThat(modifier.toPlainText(), is("static "));
	}

	@Test
	public void edge_no_name() {
		Modifier modifier = new Modifier();
		assertThat(modifier.toPlainText(), is(""));
	}

	@Test
	public void init() {
		Modifier modifier = new Modifier();
		modifier.setValue("public");
		assertThat(modifier.toPlainText(), is("public "));
	}
}
