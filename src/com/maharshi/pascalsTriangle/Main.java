package com.maharshi.pascalsTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();

		list.add(new ArrayList<Integer>(Arrays.asList(1)));
		if (numRows == 1)
			return list;
		list.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
		if (numRows == 2)
			return list;
		else {
			for (int i = 0; i < numRows - 2; i++) {
//				Get most last list to iterate
				List<Integer> tempList1 = list.get(list.size() - 1);
				List<Integer> tempList2 = new ArrayList<Integer>(Arrays.asList(1));
				for (int j = 0; j < tempList1.size() - 1; j++) {
					tempList2.add(tempList1.get(j) + tempList1.get(j + 1));
				}
				tempList2.add(1);
				list.add(tempList2);
			}
			return list;
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> list = generate(6);
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j));
			}
			System.out.println();
		}
	}

}
