package com.technical.hello.service;

import com.technical.hello.entity.ResponseData;

public interface IWordService {

	/**
	 * This will validateWord as per bussiness logic
	 * @param wordName
	 * @return ResponseData
	 */
	ResponseData validateWord(String wordName);
}
