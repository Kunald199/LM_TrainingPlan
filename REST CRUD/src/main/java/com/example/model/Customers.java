package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
// With entity automatically table will be created when we run project
public class Customers {
	@Id
private int cid;
private String cname;
private String cemail;
private String cadd;
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCemail() {
	return cemail;
}
public void setCemail(String cemail) {
	this.cemail = cemail;
}

@Override
public String toString() {
	return "Customer Id: "+cid+" Name: "+cname+ "Address: "+cadd+" Email: "+cemail;
}

}
