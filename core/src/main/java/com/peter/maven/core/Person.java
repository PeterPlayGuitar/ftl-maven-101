package com.peter.maven.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
