package org.personPack.Person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	private Person person, person1;

	@Before
	public void setUp() {
		person = new Person("Poonam", 15, 7, 1982);
		person1 = new Person("Archana", 2, 9, 1987);
	}

	@Test
	public void testForolderOne() {
		String expected = "Poonam is older than Archana by 5 years, 1 months 18 Days";
		String actual = person1.older(person, person1);
		assertEquals(expected, actual);
	}

}
