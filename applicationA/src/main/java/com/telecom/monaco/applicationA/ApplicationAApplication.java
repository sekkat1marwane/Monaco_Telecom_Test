package com.telecom.monaco.applicationA;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.telecom.monaco.applicationA.dao.ServiceRepository;
import com.telecom.monaco.applicationA.entity.Service;

@SpringBootApplication
public class ApplicationAApplication implements CommandLineRunner{

	
	@Autowired
	private ServiceRepository serviceRepository;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	private Service service1;
	private Service service2;
	private Service service3;
	private Service service4;
	private Service service5;

	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.repositoryRestConfiguration.exposeIdsFor(Service.class);
		
		service1 = new Service(null,"service1","active");
		service2 = new Service(null,"service2","enabled");
		service3 = new Service(null,"service3","active");
		service4 = new Service(null,"service4","enabled");
		service5 = new Service(null,"service5","active");
		
		System.out.println(service1.toString());
		
			this.serviceRepository.save(service1);
			this.serviceRepository.save(service2);
			this.serviceRepository.save(service3);
			this.serviceRepository.save(service4);
			this.serviceRepository.save(service5);

	}
	
	

}
