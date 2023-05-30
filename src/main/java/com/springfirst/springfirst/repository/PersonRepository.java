package com.springfirst.springfirst.repository;

import com.springfirst.springfirst.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
