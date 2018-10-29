package com.technical.hello.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.technical.hello.entity.ResponseData;

@Service
public class WordServiceImpl implements IWordService {

	/**
	 * This method is used to check different functions for different functionality
	 * @param wordName
	 * @return ResponseData
	 */
	@Override
	public ResponseData validateWord(String wordName) {
		ResponseData responseData = new ResponseData();
		responseData.setWord(wordName);
		responseData.setPalindrome(checkPalindrome(wordName));
		responseData.setAnagramOfPalindrome(checkAnagramOfPalindrome(wordName));
		return responseData;
	}

	private Boolean checkAnagramOfPalindrome(String wordName) {
		 int [] count = new int[26];
	        for( int i = 0; i < wordName.length(); i++ )
	        {
	            char ch = wordName.charAt(i);
	            count[ch-'a']++;
	        }
	        int oddOccur = 0;
	        for( int cnt:count )
	        {
	            if( oddOccur > 1) // more than 1 char should have odd frequency
	                return false;
	            if( cnt%2 == 1 )
	                oddOccur++;
	        }
	        return true;

	}

	private Boolean checkPalindrome(String wordName) {
		if (!StringUtils.isEmpty(wordName)) {
			char[] arr = wordName.toCharArray();
			for (int i = 0; i < arr.length / 2; i++) {
				if (arr[i] != arr[arr.length - 1 - i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
