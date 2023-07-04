package com.example.PracticeCRUD.Repository;

import com.example.PracticeCRUD.Entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface RepoPerson extends CrudRepository<Person,Integer> {
}
