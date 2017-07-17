package com.revature.beans;

import com.revature.data.Person;

public abstract class PersonImpl implements Person{
	
	private String name;
	private Country country;
	private int age;

	public PersonImpl() {
		name = "Bobby";
		country = Country.Egypt;
		age = 12;
	}
	
	public PersonImpl(String name, Country country, int age) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Country getCountry() {
		return country;
	}

	public int getAge() {
		return age;
	}
	@Override
	public abstract int getChoice(int numOfChoices);

	@Override
	public String toString() {
		return "PersonImpl [name=" + name + ", country=" + country + ", age=" + age + "]";
	}
}
