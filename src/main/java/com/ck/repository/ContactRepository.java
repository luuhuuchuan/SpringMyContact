package com.ck.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ck.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
	List<Contact> findByNameContaining(String q);
}
