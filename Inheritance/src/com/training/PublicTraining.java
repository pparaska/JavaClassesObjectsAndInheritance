package com.training;

/**
 * 
 * @author Poonam Paraskar 
 * 		   PublicTraining is child class of Training and
 *         implements getOrderValue() method which depends on parameters like
 *         fees and numberOfParticipants which return total cost for publicTraining 
 *
 */
public class PublicTraining extends Training {
	private int participants;

	public PublicTraining(String subject, double fees, int participants) {
		super(subject, fees);
		this.participants = participants;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	@Override
	public double getOrderValue() {
		return (getFees() * participants);
	}
}
