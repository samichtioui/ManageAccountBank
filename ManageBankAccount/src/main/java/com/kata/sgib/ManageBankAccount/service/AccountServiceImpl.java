package com.kata.sgib.ManageBankAccount.service;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.kata.sgcib.ManageBankAccount.Enum.Operation;
import com.kata.sgib.ManageBankAccount.entities.Account;
import com.kata.sgib.ManageBankAccount.entities.Customer;

/**
 * 
 * @author Sami Chtioui
 *
 */

public class AccountServiceImpl implements AccountService{

	/** The Constant logger. */
	public static final Logger logger = LogManager.getLogger(Account.class);
	

	/**
	 * getHistoryList
	 * 
	 * @param user
	 */
	public void getHistoryList(Customer customer) {
		logger.info("Balance  of "+customer.getFirstName()+" "+customer.getName()+" : "+customer.getBalance());
		
		for (Account history : customer.getAccountList()) {
			logger.info(history.toString());
		}
	}
	
	/**
	 * depositAmount
	 * 
	 * @param customer
	 * @param amount
	 * @return
	 */
	public Customer depositAmount(Customer customer, Double amount) {
		customer.setBalance(customer.getBalance() + amount);
		
		Date date = new Date();
		Account account = new Account(Operation.DEPOSIT, date, amount, customer.getBalance());
		customer.getAccountList().add(account);
		
		logger.info("Operation deposit : "+amount+" €  ===> "+customer.getFirstName()+" "+customer.getName());
		return customer;
	}

	/**
	 * withdrawalAmount
	 * 
	 * @param customer
	 * @param amount
	 * @return
	 */
	public Customer withdrawalAmount(Customer customer, Double amount) {
		customer.setBalance(customer.getBalance() - amount);

		Date date = new Date();
		Account history = new Account(Operation.WITHDRAWAL, date, amount, customer.getBalance());
		customer.getAccountList().add(history);
		
		logger.info("Operation withdrawal : "+amount+" €  ===> "+customer.getFirstName()+" "+customer.getName());
		return customer;
	}

}
