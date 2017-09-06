package org.Person.controller;

import java.util.List;

import org.Person.dao.PersonRepository;
import org.Person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@Autowired
	PersonRepository personRepository;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public List<Person> savePerson(@RequestBody String name){
		Person p=new Person();
		p.setName(name);
		p.setAge(22);
		p.setAddress("合肥");
		personRepository.addPerson(p);
		List<Person> list=personRepository.findAllPerson();
		return list;
	}
}
