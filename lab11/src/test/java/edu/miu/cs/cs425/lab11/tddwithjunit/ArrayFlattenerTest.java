package edu.miu.cs.cs425.lab11.tddwithjunit;



import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTest {

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
	public final void testArrayFlattener() {
		Integer[][] input = { { 1, 3 }, { 0 }, { 4,5,9} };
		Integer[] expecteds= {1,3,0,4,5,9};
		Integer[] actuals=arrayflattener.flattenArray(input);
		assertArrayEquals(expecteds, actuals);

	}

}
