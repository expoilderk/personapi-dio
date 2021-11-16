package com.expoilderk.dio.personapi.repository;

import com.expoilderk.dio.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
