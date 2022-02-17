package com.telecom.monaco.applicationA.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.monaco.applicationA.dao.ServiceRepository;
import com.telecom.monaco.applicationA.entity.Service;

//@ComponentScan(basePackages={"com.telecom.monaco.applicationA.web"}) 
//@RestController
//@CrossOrigin
//public class ServiceRestController {
//
//	@Autowired
//	ServiceRepository serviceRepository;
//	
//	@GetMapping("/{uuid}")
//	public Service getService(@PathVariable Long uuid)
//	{
//		return serviceRepository.getById(uuid);
//	}
//}
