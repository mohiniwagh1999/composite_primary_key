package com.com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.entity.Person;
import com.com.entity.PersonPK;

public interface PersonRepo extends JpaRepository<Person,PersonPK> {

}
