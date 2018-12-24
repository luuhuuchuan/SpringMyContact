package com.ck.service;

import java.util.List;
import java.util.Optional;

import com.ck.domain.Contact;

public interface ContactService {
	Iterable<Contact> findAll();
	List<Contact> search(String q);
	Optional<Contact> findByID(int id);
	void save(Contact contact);
	void delete(int id);
}
