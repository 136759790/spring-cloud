package org.Person.dao;

import java.util.List;

import org.Person.domain.Person;

public interface PersonRepository {
	int addPerson(Person p);
	Person findPersonById(Integer id);
	List<Person> findAllPerson();
}
