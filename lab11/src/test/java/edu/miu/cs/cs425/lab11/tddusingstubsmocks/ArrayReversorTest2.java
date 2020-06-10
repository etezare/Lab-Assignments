/**
 * 
 */
package edu.miu.cs.cs425.lab11.tddusingstubsmocks;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.miu.cs.cs425.lab11.tddusingstubsmocks.service.IArrayFlattnerService;

/**
 * @author Essey
 *
 */
public class ArrayReversorTest2 {
	private ArrayReversor arrayreversor;
	private IArrayFlattnerService iArrayFlattenerService=mock(IArrayFlattnerService.class);
	@Before
	public void setUp() throws Exception {
		this.arrayreversor=new ArrayReversor(iArrayFlattenerService);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.arrayreversor=null;
	}

	@Test
	public void ArrayReversortest2() {
	when(iArrayFlattenerService.flattenerArray(null)).thenReturn(null);	
	int[] actual=arrayreversor.reverseArray(null);
	int[] expected= null;
	assertArrayEquals(expected,actual);
	verify(iArrayFlattenerService).flattenerArray(null);
	
	}
}
