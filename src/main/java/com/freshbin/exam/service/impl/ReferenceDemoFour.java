package com.freshbin.exam.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.freshbin.exam.utils.StringUtils;

public class ReferenceDemoFour {

	public static List<String> permutation(List<String> inputList) {
		List<String> resList = new ArrayList<>();
		permutationInt(inputList, resList, 0, new char[inputList.size()]);
		return resList;
	}

	private static void permutationInt(List<String> inputList, List<String> resList, int ind, char[] arr) {
		if (ind == inputList.size()) {
			String result = new String(arr);
			resList.add(StringUtils.trimBlankChar(result));
			return;
		}
		if("".equals(inputList.get(ind))) {
			permutationInt(inputList, resList, ind + 1, arr);
		} else {
			for (char c : inputList.get(ind).toCharArray()) {
				arr[ind] = c;
				permutationInt(inputList, resList, ind + 1, arr);
			}
		}
	}
	
	public static void main(String[] args) {
		List<String> iStrings = new ArrayList<>();
		iStrings.add(" ");
		iStrings.add("abc");
		iStrings.add("pqrs");
		List<String> testList = permutation(iStrings);
		for(String string : testList) {
			System.out.println(string);
		}
		System.out.println(testList.size());
	}
}
