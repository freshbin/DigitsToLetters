package com.freshbin.exam.service;

import java.util.List;

/**
 * @Description: 测试题
 * @author freshbin
 * @Date 2020年3月7日 下午7:18:59 
 */
public interface DigitsToLettersService {
	
	/**
	 * @Description: 给定一个数字九宫格，输入输出示例如下（其中0和1不输出任何字母）：
	 * Input: arr[] = {2, 3}
     * Output: ad ae af bd be bf cd ce cf
     * 
     * Input: arr[] = {9}
     * Output: w x y z
     * 
	 * @author: freshbin
	 * @param digitsArray
	 * @return String
	 */
	public String digitsArrayToLetters(Integer[] digitsArray);
	
	/**
	 * @Description: 实现一个能将0-99转为字母的程序
	 * @author: freshbin
	 * @param digits
	 * @return String
	 */
	public List<String> digitsToLetters(Integer digits);
}
