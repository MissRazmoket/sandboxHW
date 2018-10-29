package com.socgen.basicsreview;

public class Person {

    private String firstname;

    private String lastname;

    private int age;

    public Person(String firstname, String lastname) {
	this.firstname = firstname;
	this.lastname = lastname;
    }

    public Person(String firstname, String lastname, int age) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
    }

    private String getFirstname() {
	return firstname;
    }

    public String getLastname() {
	return lastname;
    }

    public int getAge() {
	return age;
    }

    @Override
    public String toString() {
	return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
    }

}
