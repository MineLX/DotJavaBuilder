package com.zyh.pro.dotjavabuilder.test;

import com.zyh.pro.dotjavabuilder.main.AssignOperation;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AssignOperationTest {
	@Test
	public void simple_test() {
		AssignOperation operation = new AssignOperation();
		operation.setValue("hello");
		assertThat(operation.toPlainText(), is("=hello"));
		operation.setNone();
		assertThat(operation.toPlainText(), is(""));
	}
}
