package batch.processing.config;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import batch.processing.entity.Customer;
import batch.processing.repository.CustomerRepository;


@Component
public class CustomerWriter implements ItemWriter<Customer> {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void write(Chunk<? extends Customer> chunk) throws Exception {
		// TODO Auto-generated method stub
		customerRepository.saveAll(chunk);

	}

}
