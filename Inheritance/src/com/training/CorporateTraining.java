package com.training;

/**
 * @author Poonam Paraskar CorporateTraining is child class of Training and
 *         implements getOrderValue() method which depends on parameters like
 *         fees and numberOfDays which return total cost for publicTraining 
 */
public class CorporateTraining extends Training {
	private int days;

	public CorporateTraining(String subject, double fees, int days) {
		super(subject, fees);
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public double getOrderValue() {
		return (getFees() * days);
	}

}
