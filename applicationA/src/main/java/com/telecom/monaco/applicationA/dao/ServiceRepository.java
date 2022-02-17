package com.telecom.monaco.applicationA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.telecom.monaco.applicationA.entity.Service;

@CrossOrigin
@RepositoryRestResource
public interface ServiceRepository extends JpaRepository<Service, Long>{

}
