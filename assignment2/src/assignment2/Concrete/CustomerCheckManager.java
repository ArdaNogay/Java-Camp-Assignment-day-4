package assignment2.Concrete;

import assignment2.Abstract.ICustomerCheckService;
import assignment2.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		
	}

}
