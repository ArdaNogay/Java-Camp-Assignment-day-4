package assignment2.Concrete;

import assignment2.Abstract.BaseCustomerManager;
import assignment2.Abstract.ICustomerCheckService;
import assignment2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		
		if( customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person!");
		}
		
	}

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}


}
