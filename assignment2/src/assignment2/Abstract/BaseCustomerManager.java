package assignment2.Abstract;

import assignment2.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void Save(Customer customer) {
		
		System.out.println("Saved to db : "+customer.getFirstName());
		
	}
	

}
