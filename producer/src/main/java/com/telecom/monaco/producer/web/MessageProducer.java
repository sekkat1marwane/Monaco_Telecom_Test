package com.telecom.monaco.producer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.telecom.monaco.producer.model.Service;

@RestController
@ComponentScan(basePackages={"com.telecom.monaco.consumer.web"}) 
public class MessageProducer {
	
	@Autowired
	private Processor processor;
	
	@GetMapping(value ="/producer/{uuid}")
	public void sendServiceId(@PathVariable int uuid)
	{
		processor.output().send(MessageBuilder.withPayload(uuid).build());
		System.out.println("la fonction est executee");
	}
	
	


}
