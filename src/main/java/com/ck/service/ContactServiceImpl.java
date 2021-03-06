package com.ck.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ck.domain.Contact;
import com.ck.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public Iterable<Contact> findAll() {
		return contactRepository.findAll();
	}

	@Override
	public List<Contact> search(String q) {
		return contactRepository.findByNameContaining(q);
	}

	@Override
	public Optional<Contact> findByID(int id) {
		return contactRepository.findById(id);
	}

	@Override
	public void save(Contact contact) {
		contactRepository.save(contact);
	}

	@Override
	public void delete(int id) {
		contactRepository.deleteById(id);
	}
}
