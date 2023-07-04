package com.example.PracticeCRUD.Controller;

import com.example.PracticeCRUD.Entity.Person;
import com.example.PracticeCRUD.Service.ServicePersonIMPL.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class Controlador {

    @Autowired
    private PSIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultPerson",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultPerson() {

        List<Person> PersonList=this.impl.ConsultPerson();

        return ResponseEntity.ok(PersonList);

    }
    @PostMapping
    @RequestMapping(value = "CreatePerson", method = RequestMethod.POST)
    public ResponseEntity<?> CreatePerson(@RequestBody Person person){

        Person createdPerson = this.impl.CreatePerson(person);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdPerson);

    }

    @PutMapping
    @RequestMapping(value = "ModifyPerson", method = RequestMethod.PUT)
    public ResponseEntity<?> ModifyPerson(@RequestBody Person person){

        Person modifitedPerson = this.impl.ModifyPerson(person);

        return ResponseEntity.status(HttpStatus.CREATED).body(modifitedPerson);

    }
    @GetMapping
    @RequestMapping(value = "SearchPerson/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> SearchPerson(@PathVariable int id){

        Person person = this.impl.SearchPerson(id);

        return ResponseEntity.ok(person);

    }
    @DeleteMapping
    @RequestMapping(value = "DeletePerson/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> DeletePerson(@PathVariable int id){

        this.impl.DeletePerson(id);

        return ResponseEntity.ok().build();
    }

}
