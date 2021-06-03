package assignment2;

import java.time.LocalDate;

import Adapters.MernisSerciveAdapter;
import assignment2.Abstract.BaseCustomerManager;
import assignment2.Concrete.StarbucksCustomerManager;
import assignment2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisSerciveAdapter());
		customerManager.Save(new Customer(1, "Engin", "Demirog", LocalDate.of(1985, 1, 6), "28861499108"));

	}

}
