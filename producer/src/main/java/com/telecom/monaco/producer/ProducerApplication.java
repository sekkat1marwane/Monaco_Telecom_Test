package com.telecom.monaco.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.monaco.producer.model.Service;

@EnableBinding(Processor.class)
@SpringBootApplication
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}



//	public void handle(Service service)
//	{
//		System.out.println("this is the service returned" + service);
//	}	
	
	


}
