package com.telecom.monaco.applicationA.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Service implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uuid;
	private String tag;
	private String action;
	
	

	public Service(Long uuid, String tag, String action) {
		this.uuid=uuid;
		this.tag=tag;
		this.action = action;
	}
	
	public Service() {

	}

	public Long getUuid() {
		return uuid;
	}

	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Service [uuid=" + uuid + ", tag=" + tag + ", action=" + action + "]";
	}
	
	
}
