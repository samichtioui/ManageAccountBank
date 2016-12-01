package com.kata.sgib.ManageBankAccount.service;

import com.kata.sgib.ManageBankAccount.entities.Customer;

public interface AccountService {
	
	/**
	 * Methode qui fait un deposit sur un compte bancaire
	 *
	 * @param customer
	 * @param amount
	 * @return
	 */
	public Customer depositAmount(Customer customer, Double amount);
	
	/**
	 * Methode qui fait un prelevement sur un compte bancaire
	 *
	 * @param customer
	 * @param amount
	 * @return
	 */
	public Customer withdrawalAmount(Customer customer, Double amount);
	
	/**
	 * Methode qui fait affiche l'historique d'un compte bancaire
	 *
	 * @param user
	 */
	void getHistoryList(Customer user);

}
