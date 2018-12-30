package com.training;
/**
 * 
 * @author Poonam Paraskar
 * Training class is an abstract parent class takes id, subject,fees as parameters and uses Static and 
 * non-static initializers to make id as auto-increment. It contains getOrderValue() as an abstract method
 * for its child classes to implement this method
 *
 */
public abstract class Training {
	private int id;
	private String subject;
	private double fees;
	private static int idGenerator;

	static {
		idGenerator = 100;
	}

	{
		id = ++idGenerator;
	}

	public Training(String subject, double fees) {
		this.subject = subject;
		this.fees = fees;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public abstract double getOrderValue();

}
