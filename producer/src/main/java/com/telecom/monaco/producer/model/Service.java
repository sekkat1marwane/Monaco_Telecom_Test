package com.telecom.monaco.producer.model;

import java.io.Serializable;

public class Service implements Serializable{
	
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
