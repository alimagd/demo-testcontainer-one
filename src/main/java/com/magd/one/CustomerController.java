package com.magd.one;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CustomerController {

  private final CustomerRepository repository;

  CustomerController(CustomerRepository repo) {
    this.repository = repo;
  }

  @GetMapping("/api/customers")
  List<Customer> getAll() {
    return repository.findAll();
  }
}