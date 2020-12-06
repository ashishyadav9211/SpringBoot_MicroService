package com.codingtest.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.codingtest.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Serializable> {}
