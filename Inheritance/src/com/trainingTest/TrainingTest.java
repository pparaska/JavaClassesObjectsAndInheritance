package com.trainingTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.CorporateTraining;
import com.training.PublicTraining;
import com.training.Training;

public class TrainingTest {
	private Training publicTraining, corporateTraining;

	@Before
	public void setUp() {
		publicTraining = new PublicTraining("Java", 5000, 50);
		corporateTraining = new CorporateTraining("BigData", 35000, 4);
	}

	@Test
	public void testForCostOfPublicTraining() {
		double actual = publicTraining.getOrderValue();
		double expected = 250000;
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void testForCostOfCorporateTraining() {
		double actual = corporateTraining.getOrderValue();
		double expected = 140000;
		assertEquals(expected, actual, 0.0);
	}

}
