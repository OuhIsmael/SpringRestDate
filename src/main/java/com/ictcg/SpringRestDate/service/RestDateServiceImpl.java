package com.ictcg.SpringRestDate.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.ictcg.SpringRestDate.model.RestDate;

@Service
public class RestDateServiceImpl implements RestDateService {

	//TODO Add attribute isUS, if it is true you will send response in am/pm format
	@Override
	public RestDate getRestDate() {
		RestDate restDate = new RestDate();
		LocalDateTime dateTime = LocalDateTime.now();
		restDate.setDate(dateTime.toLocalDate());
		restDate.setTime(dateTime.toLocalTime());
		return restDate;
	}

}
