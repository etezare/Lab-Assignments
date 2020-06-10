/**
 * 
 */
package edu.miu.cs.cs425.lab11.tddusingstubsmocks;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.miu.cs.cs425.lab11.tddusingstubsmocks.service.IArrayFlattnerService;

/**
 * @author Essey
 *
 */

public class ArrayReversorTest {
	private ArrayReversor arrayreversor;
	private IArrayFlattnerService iArrayFlattenerService = mock(IArrayFlattnerService.class);

	@Before
	public void setUp() throws Exception {
		this.arrayreversor = new ArrayReversor(iArrayFlattenerService);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.arrayreversor = null;
	}

	@Test
	public void ArrayReversortest() {
//	doReturn(new int[] {1,3,0,4,5,9}).when(iArrayFlattenerService).flattenerArray(new int [][] {{1,3},{0},{4,5,9}});
////	.thenReturn(new int[] {1,3,0,4,5,9});	
		int [][] arr=new int[][] { { 1, 3 }, { 0 }, { 4, 5, 9 } };
		int [] flat=new int[] { 1, 3, 0, 4, 5, 9 };
		when(iArrayFlattenerService.flattenerArray(arr))
				.thenReturn(flat);
		int[] actual = arrayreversor.reverseArray(arr);
		int[] expected = new int[] { 9, 5, 4, 0, 3, 1 };
		assertArrayEquals(expected, actual);
		verify(iArrayFlattenerService).flattenerArray(arr);

	}
}
