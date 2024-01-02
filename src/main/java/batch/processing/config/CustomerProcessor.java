package batch.processing.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import batch.processing.entity.Customer;

@Component
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		/*
		 * if (customer.getCountry().equals("United States")) { return customer; } else
		 * { return null; }
		 */

		return customer;
	}

}
