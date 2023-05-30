package com.springfirst.springfirst.controllers;

import com.springfirst.springfirst.models.Person;
import com.springfirst.springfirst.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController
{
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public String index()
    {
        return "index";
    }


    @GetMapping("/newPerson")
    public String newPerson(Model model)
    {
        Person person = new Person();
        model.addAttribute("person", person);
        return "newPerson";
    }

    @PostMapping("/newPerson")
    public String newPersonPost(@ModelAttribute Person person)
    {
        personRepository.save(person);
        return "index";
    }
}
