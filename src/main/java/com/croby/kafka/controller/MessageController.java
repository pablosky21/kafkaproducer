package com.croby.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.croby.kafka.dto.UserDto;

@RestController
public class MessageController {

	@Autowired
	private KafkaTemplate<String, UserDto> kafkaTemplate;
	
	private static final String TOPIC = "quickstart-events";
	@GetMapping("/publish/{name}")
	public String pusblishMessage(@PathVariable("name") final String name) {
		
		kafkaTemplate.send(TOPIC,new UserDto(name,"paranal","1000") );
		return "Mensaje exitoso";
		
	}
}
