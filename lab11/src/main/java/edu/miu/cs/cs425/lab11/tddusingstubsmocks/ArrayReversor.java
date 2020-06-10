package edu.miu.cs.cs425.lab11.tddusingstubsmocks;

import java.util.stream.IntStream;

import edu.miu.cs.cs425.lab11.tddusingstubsmocks.service.IArrayFlattnerService;

public class ArrayReversor {
	private IArrayFlattnerService arrayflattener;

	public ArrayReversor(IArrayFlattnerService arrayflattener) {
		this.arrayflattener = arrayflattener;
	}

	public int[] reverseArray(int[][] arr) {

		int[] flat = arrayflattener.flattenerArray(arr);
		System.out.println(flat);
//		Integer[] reversed = new Integer[flat.length];
//		int j = 0;
//		for (int i = flat.length - 1; i >= 0; i--) {
//			reversed[j++] = flat[i];
//
//		}
//
//		return reversed;
		if (flat != null) {
			return IntStream.rangeClosed(1, flat.length).map(i -> flat[flat.length - i]).toArray();
		}
		return null;

	}
}
