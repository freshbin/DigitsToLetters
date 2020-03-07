package com.freshbin.exam.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.freshbin.exam.service.DigitsToLettersService;
import com.freshbin.exam.utils.DigitsMapLetter;
import com.freshbin.exam.utils.StringUtils;

/**
 * @Description: 测试题实现类
 * @author freshbin
 * @Date 2020年3月7日 下午7:19:10
 */
@Service
public class DigitsToLettersServiceImpl implements DigitsToLettersService {

	@Override
	public String digitsArrayToLetters(Integer[] digitsArray) {
		if(digitsArray.length == 0) {
			return null;
		}
		List<String> lettersList = new ArrayList<>();
		for (Integer digits : digitsArray) {			
			String digitsMapLettersList = digitsMapLetters(digits);
			lettersList.add(digitsMapLettersList);
		}
		
		List<String> resultList = permutation(lettersList);
		System.out.println("总的组合数：" + resultList.size());
		
		StringBuffer resultString = new StringBuffer();
		for (String string : resultList) {
			resultString.append(string).append(" ");
		}
		return resultString.toString();
	}
	
	private List<String> permutation(List<String> inputList) {
		List<String> resList = new ArrayList<>();
		permutationInt(inputList, resList, 0, new char[inputList.size()]);
		return resList;
	}
	
	private void permutationInt(List<String> inputList, List<String> resList, int ind, char[] arr) {
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
	
	/**
	 * @Description: 数字与字母对应关系
	 * @author: freshbin
	 * @param digits
	 * @return String[]
	 */
	private String digitsMapLetters(Integer digits) {
		String letters = " ";
		switch (digits) {
		case 1:
			letters = DigitsMapLetter.ONE;
			break;
		case 2:
			letters = DigitsMapLetter.TWO_A_B_C;
			break;
		case 3:
			letters = DigitsMapLetter.THREE_D_E_F;
			break;
		case 4:
			letters = DigitsMapLetter.FOUR_G_H_I;
			break;
		case 5:
			letters = DigitsMapLetter.FIVE_J_K_L;
			break;
		case 6:
			letters = DigitsMapLetter.SIX_M_N_O;
			break;
		case 7:
			letters = DigitsMapLetter.SEVEN_P_Q_R_S;
			break;
		case 8:
			letters = DigitsMapLetter.EIGHT_T_U_V;
			break;
		case 9:
			letters = DigitsMapLetter.NIGHT_W_X_Y_Z;
			break;
		default:
			letters = DigitsMapLetter.ZERO;
			break;
		}

		return letters;
	}

	@Override
	public List<String> digitsToLetters(Integer digitsParam) {
		String tranString = String.valueOf(digitsParam);
		List<String> lettersList = new ArrayList<>();
		for(int i = 0; i < tranString.length(); i++) {
			int digits = Integer.valueOf(tranString.substring(i, i+1));
			String letters = digitsMapLetters(digits);
			lettersList.add(letters);
		}
		
		List<String> resultList = permutation(lettersList);
		return resultList;
	}
}
