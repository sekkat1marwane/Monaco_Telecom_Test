package com.telecom.monaco.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.client.RestTemplate;

import com.telecom.monaco.consumer.model.Service;

@EnableBinding(Processor.class)
@SpringBootApplication
public class ConsumerApplication {

	

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
	
	
	@StreamListener(Processor.INPUT)
//	@SendTo(Processor.OUTPUT) 
// remplacer void par Service si @SendTo est décommenté pour envoyer l'objet service à la queue
	public void handle(Long uuid)
	{
		if(uuid<=5)
		{
			RestTemplate restTemplate = new RestTemplate();
			Service service = restTemplate.getForObject("http://localhost:8082/services/"+uuid,  Service.class);		
			System.out.println(service.toString());
			// return service;
		}else
		{
			System.out.println("veuillez renseigner un uuid entre 1 et 5");
		}

	}

}
