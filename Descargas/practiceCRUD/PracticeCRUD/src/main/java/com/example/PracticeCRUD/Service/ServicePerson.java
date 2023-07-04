package com.example.PracticeCRUD.Service;

import com.example.PracticeCRUD.Entity.Person;

import java.util.List;

public interface ServicePerson {

    public List<Person> ConsultPerson();

    public Person CreatePerson(Person person);

    public Person ModifyPerson(Person person);

    public Person SearchPerson(int id);

    public void DeletePerson(int id);
}
