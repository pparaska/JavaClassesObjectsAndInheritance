package com.bankAccount;

import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

public class BankTest {

	@Test(expected = InvalidInputException.class)
	public void currentAccountNegative() {
		Logger logger = Logger.getLogger(MMBankFactory.class.getName());
		BasicConfigurator.configure();
		logger.info("This is my BankAccount");
		BankFactory mmBankFactory = new MMBankFactory();
		MMCurrentAccount mmCurrentAccount = (MMCurrentAccount) mmBankFactory
				.getNewCurrentAccount("Poonam", 0, 1000);
		try {
			mmCurrentAccount.withdraw(-10);
			logger.debug("Invalid Input Exception");
		} catch (Exception e) {
			logger.debug("Invalid Input Exception this is using loggers");
			RuntimeException invalidException = new InvalidInputException();
			invalidException.initCause(e);
			throw invalidException;
		}
	}

	@Test(expected = InvalidInputException.class)
	public void currentAccountZero() {
		BankFactory mmBankFactory = new MMBankFactory();
		MMCurrentAccount mmCurrentAccount = (MMCurrentAccount) mmBankFactory
				.getNewCurrentAccount("Poonam", 0, 1000);
		try {
			mmCurrentAccount.withdraw(0);
		} catch (Exception e) {
			RuntimeException invalidException = new InvalidInputException();
			invalidException.initCause(e);
			throw invalidException;
		}
	}

	@Test
	public void currentAccountNormalCheck() {
		BankFactory mmBankFactory = new MMBankFactory();
		MMCurrentAccount mmCurrentAccount = (MMCurrentAccount) mmBankFactory
				.getNewCurrentAccount("Poonam", 0, 1000);
		try {
			mmCurrentAccount.deposit(5000);
			mmCurrentAccount.withdraw(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void savingsAccount() {
		BankFactory mmBankFactory = new MMBankFactory();
		MMSavingsAccount mmSavingsAccount = (MMSavingsAccount) mmBankFactory
				.getNewSavingsAccount("Poonam", 0, true);
		try {
			mmSavingsAccount.deposit(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expected = RuntimeException.class)
	public void savingsAccountZero() {
		BankFactory mmBankFactory = new MMBankFactory();
		MMSavingsAccount mmSavingsAccount = (MMSavingsAccount) mmBankFactory
				.getNewSavingsAccount("Archana", 0, true);
		try {
			mmSavingsAccount.withdraw(0);
		} catch (Exception e) {
			RuntimeException invalidException = new InvalidInputException();
			invalidException.initCause(e);
			throw invalidException;
		}
	}

	@Test
	public void savingsAccountNormal() {
		BankFactory mmBankFactory = new MMBankFactory();
		MMSavingsAccount mmSavingsAccount = (MMSavingsAccount) mmBankFactory
				.getNewSavingsAccount("Archana", 0, true);
		try {
			mmSavingsAccount.deposit(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expected = RuntimeException.class)
	public void savingsAccountExceeds() throws Exception {
		BankFactory mmBankFactory = new MMBankFactory();
		MMSavingsAccount mmSavingsAccount = (MMSavingsAccount) mmBankFactory
				.getNewSavingsAccount("Archana", 0, true);
		try {
			mmSavingsAccount.deposit(1000);
			mmSavingsAccount.withdraw(2000);
		} catch (Exception e) {
			RuntimeException insufficientFunds = new InsufficientFundsException();
			insufficientFunds.initCause(e);
			throw insufficientFunds;
		}
	}
}
