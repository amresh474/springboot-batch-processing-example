package batch.processing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import batch.processing.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
