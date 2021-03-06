package com.anu.bank.dao;

import org.springframework.dao.DataAccessException;

import com.anu.bank.model.Customer;

public interface CustomerDao 
{
	public Customer authenticate(Customer customer)throws DataAccessException;
	public Customer updateProfile(Customer customer)throws DataAccessException;
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) throws DataAccessException;
}
