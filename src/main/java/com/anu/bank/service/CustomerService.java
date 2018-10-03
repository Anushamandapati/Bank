package com.anu.bank.service;

import com.anu.bank.exceptions.InvalidDetailsException;
import com.anu.bank.exceptions.PasswordDetailsWrongException;
import com.anu.bank.exceptions.UserNotFoundException;
import com.anu.bank.model.Customer;

public interface CustomerService {
	public Customer authenticate(Customer customer) throws UserNotFoundException;
	public Customer updateProfile(Customer customer) throws InvalidDetailsException;
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) throws PasswordDetailsWrongException;

}
