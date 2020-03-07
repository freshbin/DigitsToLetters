package com.freshbin.exam.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.lang.Nullable;

public class StringUtils {
	public static String trimBlankChar(String inputString) {
		Pattern p = Pattern.compile("\\s*|\t|\r|\n|&nbsp;");
		Matcher m = p.matcher(inputString);
		String dest = m.replaceAll("");
		return dest;
	}
	
	/**
	 * @Description: org.springframework.util.StringUtils源码
	 * @author: freshbin
	 * @param str
	 * @return String
	 */
	public static String trimAllWhitespace(String str) {
		if (!hasLength(str)) {
			return str;
		}

		int len = str.length();
		StringBuilder sb = new StringBuilder(str.length());
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if (!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public static boolean hasLength(@Nullable String str) {
		return (str != null && !str.isEmpty());
	}
	
	public static void main(String[] args) {
		System.out.println(trimAllWhitespace("a b"));
	}
}
