package com.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Data {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String info;
	
	public Data(){}
	
	public Data(String info){
		super();
		this.info = info;
	}

	public int getId() {
		return id;
	}

	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", info=" + info + "]";
	}
}