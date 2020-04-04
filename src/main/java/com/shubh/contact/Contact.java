package com.shubh.contact;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Contact")
public class Contact {
	
	
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNo=" + contactNo + "]";
	}
	public Contact() {
		
	}
	private Integer contactId;
	
	
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	private String contactName;
	private Long contactNo;


	public Contact(Integer contactId, String contactName, Long contactNo) {
		
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactNo = contactNo;
	}

}
