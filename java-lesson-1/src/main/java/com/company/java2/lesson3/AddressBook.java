package com.company.java2.lesson3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Person> listPersons;

    public List<Person> getListPersons() {
        return listPersons;
    }

    public void setListPersons(List<Person> listPersons) {
        this.listPersons = listPersons;
    }

    public void addPerson(Person person) {
        if (this.listPersons == null) {
            this.listPersons = new ArrayList<>();
        }
        this.listPersons.add(person);
    }

    public List<Person> getListPersonsByLastName(String lastName) {
        List<Person> lp = new ArrayList<>();
        for (Person p: this.listPersons) {
            if (p.getLastName().equals(lastName))
            lp.add(p);
        }
        return lp;
    }

}
