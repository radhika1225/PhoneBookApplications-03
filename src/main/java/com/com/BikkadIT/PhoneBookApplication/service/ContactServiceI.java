package com.com.BikkadIT.PhoneBookApplication.service;

import java.util.List;

import com.com.BikkadIT.PhoneBookApplication.model.Contact;

public interface ContactServiceI {

	boolean  saveContact(Contact contact);
	
     List<Contact> getAllContact();
     Contact getContactById(Integer cid);
     public boolean updateContact(Contact contact);
}
