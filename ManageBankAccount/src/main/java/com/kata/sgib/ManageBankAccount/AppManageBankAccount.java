package com.kata.sgib.ManageBankAccount;


import com.kata.sgib.ManageBankAccount.entities.Customer;
import com.kata.sgib.ManageBankAccount.service.AccountServiceImpl;

/**
 * 
 * @author Sami Chtioui
 *
 */
public class AppManageBankAccount 
{
    public static void main( String[] args )
    {
    	
    	AccountServiceImpl accountService = new AccountServiceImpl();
    	// Access to account of Customer
		Customer customer = new Customer(00012143, "Pascal", "David", 3200.40);

		// 1- History of Account 
		accountService.getHistoryList(customer);
		// 2- Deposit Operation 
		customer = accountService.depositAmount(customer, 300.10);
		// 3- History of Account 
		accountService.getHistoryList(customer);
		
		// 4- withdrawal Operation 
		customer = accountService.withdrawalAmount(customer, 100.00);
		// 5- History of Account
		accountService.getHistoryList(customer);
		
    }
}
