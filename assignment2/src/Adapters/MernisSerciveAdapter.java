package Adapters;

import java.util.Locale;

import assignment2.Abstract.ICustomerCheckService;
import assignment2.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisSerciveAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try
		{
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityID()),customer.getFirstName().toUpperCase(new Locale("tr")),customer.getLastName().toUpperCase(new Locale("tr")),customer.getDateOfBirth().getYear());
			
		}
	
		catch(Exception e)
		{
			System.out.println("Not a valid person!");
		}

	return result;

	}
}
