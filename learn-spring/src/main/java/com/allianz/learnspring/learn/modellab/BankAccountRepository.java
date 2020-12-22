package com.allianz.learnspring.learn.modellab;


import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount, String> {

}
