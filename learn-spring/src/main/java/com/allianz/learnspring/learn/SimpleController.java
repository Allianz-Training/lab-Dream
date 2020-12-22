package com.allianz.learnspring.learn;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.allianz.learnspring.learn.modellab.BankAccount;
import com.allianz.learnspring.learn.modellab.BankAccountRepository;


@RestController
public class SimpleController {
  @Autowired
  private BankAccountRepository bankRepository;

  @RequestMapping("/")
  @ResponseBody
  String home() {
    // DTO
    //
    // JPA
    return "Hello World!";
  }

  @GetMapping("/bankaccount")
  public List<BankAccount> retriveAllBankAccounts() {
    return (List<BankAccount>) bankRepository.findAll();
  }

  @PostMapping("/addaccount")
  public BankAccount addAccount(@RequestBody BankAccount bankAccount) {
    return bankRepository.save(bankAccount);
  }

  @PutMapping("/{id}")
  public BankAccount putAccount(@PathVariable String id, @RequestBody BankAccount bankAccount) {
    BankAccount put = bankAccount;
    put.setAccountNo(id);
    return bankRepository.save(put);
  }

  @DeleteMapping("/{id}")
  public BankAccount deleteAccount(@PathVariable String id, @RequestBody BankAccount bankAccount) {
    BankAccount put = bankRepository.findById(id).get();
    bankRepository.delete(put);
    return put;
  }



}


