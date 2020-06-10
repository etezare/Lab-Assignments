package edu.miu.cs.cs425.lab11.tddwithjunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTest2 {


	private ArrayFlattener arrayflattener = null;

	@Before
	public void setUp() throws Exception {
		this.arrayflattener = new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		this.arrayflattener = null;
	}

	@Test
	public final void testArrayFlattenerNull() {
		Integer[] [] input=null;
		Integer[] expecteds=null;
		Integer[] actuals=arrayflattener.flattenArray(input);
		assertArrayEquals(expecteds,actuals);
	}
}
