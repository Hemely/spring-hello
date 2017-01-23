package spring.hello.repository;

import org.springframework.data.repository.CrudRepository;
import spring.hello.entity.Customer;

import java.util.List;

/**
 * Created by martin on 23/01/17.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

}
