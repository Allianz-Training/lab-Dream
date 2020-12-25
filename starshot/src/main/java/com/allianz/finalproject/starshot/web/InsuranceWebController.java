package com.allianz.finalproject.starshot.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.allianz.finalproject.starshot.bussiness.domain.InsuranceRegistration;
import com.allianz.finalproject.starshot.bussiness.domain.InsuranceRepository;


@RestController
// @RequestMapping("")
public class InsuranceWebController {
  @Autowired
  private InsuranceRepository insuranceRepository;

  @PostMapping("/addregistration")
  public InsuranceRegistration addInsuranceRegistration(
      @RequestBody InsuranceRegistration insuranceRegistration) {
    return insuranceRepository.save(insuranceRegistration);
  }

  @GetMapping("/getinsurance")
  public List<InsuranceRegistration> getinsurance() {
    return (List<InsuranceRegistration>) insuranceRepository.findAll();
  }

}
