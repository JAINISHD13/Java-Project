package com.parking.learning.Dao;

import java.util.List;

import com.parking.learning.model.Customer;
import com.parking.learning.model.Parking;

public interface CustomerDao {
	void insert(Customer customers);

	List<Customer> getAllCustomer();
	
	public List<Parking> findparkingByFid(int fid);

	public void delete(int id);

	public Customer findCUstomerById(int id);



}
