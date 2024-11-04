package com.com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.entity.Person;
import com.com.entity.PersonPK;
import com.com.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo repo;
	
	public void getPerson()
	{
		PersonPK pk=new PersonPK();
		pk.setPersonId(100);
		pk.setPassportNum(4556);
		
		Optional<Person> byId = repo.findById(pk);
		if(byId.isPresent())
		{
			Person person = byId.get();
			System.out.println(person);
		}
		else
		{
			System.out.println("person not available");
		}
	}
	
	public void savePerson()
	{
		PersonPK pk=new PersonPK();
		pk.setPersonId(100);
		pk.setPassportNum(4556);
		
		
		
		Person p=new Person();
		p.setName("mohini");
		p.setEmail("mohini@gmail.com");
		p.setGender("female");
		p.setPersonpk(pk);
		
		repo.save(p);
		System.out.println("person saved");
	}

}
