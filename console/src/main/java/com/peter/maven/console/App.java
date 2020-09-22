package com.peter.maven.console;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.peter.maven.core.Person;
import com.peter.maven.service.PersonService;

public class App {
    private static PersonService personService = new PersonService();

    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person();
        person.setLastName("Smith");
        person.setFirstName("John");
        System.out.println(person);

        String json = personService.convert(person);
        System.out.println(json);

        Person afterParse = personService.parse(json);
        System.out.println(afterParse);
    }
}
