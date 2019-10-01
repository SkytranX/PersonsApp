package com.example.personsapp.utils;

import com.example.personsapp.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Person> getList(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Michael", "Jordan", "mj23@bulls.com", "2123452321", ""));
        people.add(new Person("Michael", "Jackson", "MJ@kingofpop.com", "2123452321", ""));
        people.add(new Person("Arnold", "Schwarzenegger", "ArnoldS123@terminate.com", "2123452321", ""));
        people.add(new Person("Jonah", "Hill", "jHill123@upthere.com", "2124342321", ""));
        people.add(new Person("Michael", "Angelo", "NinjaTurtle@pizza.com", "1324445561", ""));
        people.add(new Person("Hugh", "Jackman", "HughJ@thegreatest.com", "2145653211", ""));
        people.add(new Person("Clint", "EastWood", "GrandTorino@ggtorino.com", "2123445321", ""));
        people.add(new Person("Mickey", "Mouse", "MKYMOUSE@Disney.com", "2123452321", ""));
        people.add(new Person("Joe", "Koy", "JoeKoy@wherearemykeys.com", "4133445321", ""));
        people.add(new Person("Jim", "Carry", "JCarry@themask.com", "323114551", ""));
        return people;
    }
}

