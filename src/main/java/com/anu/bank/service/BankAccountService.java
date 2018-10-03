package com.anu.bank.service;

import com.anu.bank.exceptions.AccountIdNotFoundException;
import com.anu.bank.exceptions.InsufficientFundException;

public interface BankAccountService {

	
	public double getBalance(long accountId) throws AccountIdNotFoundException;
	public double withdraw(long accountId, double amount) throws  InsufficientFundException;
	public double deposit(long accountId, double amount) throws AccountIdNotFoundException;
	public boolean fundTransfer(long fromAcc, long toAcc, double amount) throws AccountIdNotFoundException ;

}
