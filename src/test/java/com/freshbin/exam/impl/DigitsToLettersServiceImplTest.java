package com.freshbin.exam.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.freshbin.exam.service.DigitsToLettersService;

/**
 * @Description: 测试类
 * @author freshbin
 * @Date 2020年3月7日 下午10:59:53 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DigitsToLettersServiceImplTest {
	private static final Logger log = LoggerFactory.getLogger(DigitsToLettersServiceImplTest.class);
	
	@Autowired
	private DigitsToLettersService digitsToLettersService;
	
	@Test
	public void testDigitsArrayToLetters() {
		log.info("testDigitsArrayToLetters开始执行");
		
		Integer[] testArr = {1,3,0,7,8};
		String result = digitsToLettersService.digitsArrayToLetters(testArr);
		System.out.println("testDigitsArrayToLetters获取到的字母组合如下：");
		System.out.println(result);
		
		log.info("testDigitsArrayToLetters执行完毕");
	}
	
	@Test
	public void testDigitsToLetters() {
		log.info("testDigitsToLetters开始执行");
		
		Integer digitsParam = 70;
		List<String> result = digitsToLettersService.digitsToLetters(digitsParam);
		System.out.println("总共" + result.size() + "种组合");
		System.out.println("testDigitsToLetters获取到的字母组合如下：");
		for(String s : result) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		log.info("testDigitsToLetters执行完毕");
	}
	
}
