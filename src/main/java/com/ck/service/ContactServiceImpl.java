package com.ck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ck.domain.Contact;
import com.ck.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public Iterable<Contact> findAll() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public List<Contact> search(String q) {
		// TODO Auto-generated method stub
		return contactRepository.findByNameContaining(q);
	}

	@Override
	public Contact findOne(int id) {
		// TODO Auto-generated method stub
//		return contactRepository.findById(id);
		return null;
	}

	@Override
	public void save(Contact contact) {
		// TODO Auto-generated method stub
		contactRepository.save(contact);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		contactRepository.deleteById(id);
	}
	
	
	
}
