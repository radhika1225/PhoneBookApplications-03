package com.com.BikkadIT.PhoneBookApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.com.BikkadIT.PhoneBookApplication.model.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
