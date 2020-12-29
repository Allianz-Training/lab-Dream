package com.allianz.learnspring.learn;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import com.allianz.learnspring.learn.modellab.BankAccount;
import com.allianz.learnspring.learn.modellab.BankAccountRepository;

@SpringBootApplication
public class LearnApplication {
  @Autowired // This means to get the bean called userRepository
  // Which is auto-generated by Spring, we will use it to handle the data
  private BankAccountRepository bankRepository;

  public static void main(String[] args) {
    SpringApplication.run(LearnApplication.class, args);
  }



  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    return args -> {
      System.out.println("Test Test");
      BankAccount account = new BankAccount("Oak", "Test", new BigDecimal(10000), 0);
      bankRepository.save(account);
      account = new BankAccount("Dream", "Test2", new BigDecimal(880000), 0);
      bankRepository.save(account);

      Iterable<BankAccount> accs = bankRepository.findAll();
      for (BankAccount acc : accs) {
        System.out.println(acc);
      }

      // System.out.println("Let's inspect the beans provided by Spring Boot:");
      //
      // String[] beanNames = ctx.getBeanDefinitionNames();
      // Arrays.sort(beanNames);
      // for (String beanName : beanNames) {
      // System.out.println(beanName);
      // }

    };
  }
}