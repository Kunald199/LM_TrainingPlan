package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private int tid;
	private String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	public void tech() {
		System.out.println("Completed tech");
	}
	

}
