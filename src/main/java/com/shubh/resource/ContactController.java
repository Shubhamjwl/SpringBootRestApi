package com.shubh.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shubh.contact.Contact;
import com.shubh.contact.Contacts;

@RestController
@RequestMapping("/rest")
public class ContactController {
	

	//write get method with path variable
//	@GetMapping(value="/contact/{id}",
//			produces={"application/json","application/xml"}
//			)
//	public Contact getContactById(@PathVariable("id")Integer id) {
//		
//		Contact c=new Contact();
//		
//		
//		return c;
//	}
//	
	//write get method for contact object
	@GetMapping(value="/contact",
		produces= {"application/json","application/xml"}
		)
public ResponseEntity<Contacts> getAllContact(){
	
	Contacts  contact=new Contacts();
		List<Contact> list=new ArrayList<>();
		Contact c1=new Contact(101, "shubh", 947960514l);
		Contact c2=new Contact(102,"yogi",789422546l);
		
		list.add(c1);
	list.add(c2);
		
	contact.setContact(list);
	
	ResponseEntity<Contacts> response=new ResponseEntity<>(contact,HttpStatus.OK);
		return response;
	
		}
	
	    //write get method for path variable contact
//	@GetMapping(value="/contact/{id}",
//		produces={"application/json","application/xml"}
//		)
//public ResponseEntity<Contact> getContactById(@PathVariable("id")Integer id) {
//		
//		Contact c=new Contact(101,"shubh",947965014l);
//		
//		ResponseEntity<Contact> response=new ResponseEntity<>(c,HttpStatus.OK);
//		
//		return response;
//	}

	
	 //write post method  for @RequestBody 
	@PostMapping(value="/addContact",
			consumes= {"application/json","application/xml",})
	public ResponseEntity<String> addContact(@RequestBody Contact c){
		
		  c.setContactName("shubh");
		String resMsg="Contact saved successfully";
		
		return new ResponseEntity<>(resMsg,HttpStatus.CREATED);
		
		
	}
	 //write post method  for @RequestBody multiple contact
	@PostMapping(value="/addContacts",
			consumes= {"application/json","application/xml",})
	public ResponseEntity<String> addContacts(@RequestBody Contacts c){
		List<Contact> contactList=c.getContact();
		contactList.forEach(contact->{
			System.out.println(c);
		});
	
		String resMsg="Contact saved successfully";
		
		return new ResponseEntity<>(resMsg,HttpStatus.CREATED);
		
		}
	
	//write get method for @RequestHeader
	@GetMapping("/header")
	public String readHeader(@RequestHeader("secret-key")
			String secretKey) {
		
		System.out.println(secretKey);
		
		return "ok";
		
	}
	
}
