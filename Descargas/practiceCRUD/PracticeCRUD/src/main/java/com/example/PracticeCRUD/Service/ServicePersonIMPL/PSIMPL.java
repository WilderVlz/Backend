package com.example.PracticeCRUD.Service.ServicePersonIMPL;

import com.example.PracticeCRUD.Entity.Person;
import com.example.PracticeCRUD.Repository.RepoPerson;
import com.example.PracticeCRUD.Service.ServicePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements ServicePerson {

    @Autowired
    private RepoPerson repo;

    public List<Person> ConsultPerson() {
        return (List<Person>) this.repo.findAll();
    }


    public Person CreatePerson(Person person) {
        person.setName(person.getName());

        return this.repo.save(person);
    }


    public Person ModifyPerson(Person person) {
        return this.repo.save(person);
    }


    public Person SearchPerson(int id) {
        return this.repo.findById(id).get();
    }


    public void DeletePerson(int id) {
    this.repo.deleteById(id);
    }
}
