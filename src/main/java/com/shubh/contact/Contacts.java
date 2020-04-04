package com.shubh.contact;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Contacts")
public class Contacts {
	
	private List<Contact> contact;

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	public List<Contact> getContact() {
		return contact;
	}

	@Override
	public String toString() {
		return "Contacts [contact=" + contact + "]";
	}
	

	
	
	

}
