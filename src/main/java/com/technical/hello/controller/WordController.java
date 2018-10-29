package com.technical.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.technical.hello.entity.ResponseData;
import com.technical.hello.service.IWordService;

@RestController
public class WordController {
	private static final Logger logger = LoggerFactory.getLogger(WordController.class);

	@Autowired
	IWordService wordServiceImpl;

	/**
	 * This service is accept the word as input and provide output as ResponseData
	 * @param word
	 * @return
	 */
	@RequestMapping(value = "/words/{word}", method = RequestMethod.GET)
	public ResponseData words(@PathVariable("word") String word) {
		logger.info("In words method");
		return wordServiceImpl.validateWord(word);
	}

}
