package org.personPack.Person;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Locale;

/**
 * 
 * @author Poonam Paraskar
 *
 */

public class Person {

	private String name;
	private String dob;
	private int date;
	private int month;
	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Person(String name, int date, int month, int year) {
		super();
		this.name = name;
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public Person() {

	}

	public void display() {
		LocalDate dob = LocalDate.of(1991, 10, 15);
		LocalDate currentDate = LocalDate.now();
		Period p = Period.between(dob, currentDate);
		String name = getName();
		String dateOfBirth = date + "-" + month + "-" + year;
		String age = p.getDays() + "Days" + p.getMonths() + "Months"
				+ p.getYears() + "Years";
	}

	public String older(Person person, Person person1) {
		LocalDate dob = LocalDate.of(person.year, person.month, person.date);
		LocalDate personOnDob = LocalDate.of(person1.year, person1.month,
				person1.date);
		Period p = Period.between(dob, personOnDob);
		if (p.getDays() > 0 && p.getMonths() > 0 && p.getYears() > 0) {
			return person.name + " is older than " + person1.name + " by "
					+ p.getYears() + " years, " + p.getMonths() + " months "
					+ p.getDays() + " Days";
		} else
			return person1.name + " is older than " + person.name + " by "
					+ p.getYears() + " years, " + p.getMonths() + "months"
					+ p.getDays() + "Days";
	}

}