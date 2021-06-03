package assignment2.Abstract;

import assignment2.Entities.Customer;

public interface ICustomerService {
	void Save (Customer customer);
	boolean checkIfRealPerson(Customer customer);
}
