package com.example.demoAddress.Controller;

import com.example.demoAddress.Service.AddressService;
import com.example.demoAddress.VO.ResponseTemplate;
import com.example.demoAddress.model.Address;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/address/")
public class AddressController {
    private static final String ADDRESS_SERVICE = "address_service";
    @Autowired
    private AddressService as;

    @GetMapping("address/{OBJECT_ID}")
    public Address address(@PathVariable(value = "OBJECT_ID") int OBJECT_ID) {
        return as.getAddress(OBJECT_ID);

    }

    @GetMapping("{ID}")
    @CircuitBreaker(name = ADDRESS_SERVICE, fallbackMethod = "getAllCustomersAddress")
    @Retry(name = ADDRESS_SERVICE)
    public ResponseTemplate GetAddress(@PathVariable(value = "ID") int ID) {
        int count = 1;
        System.out.println("retry method call" + count++ + "times at" + new Date());
        ResponseTemplate r = as.address(ID);
        return r;

    }

    public ResponseTemplate getAllCustomersAddress(Exception e) {
        ResponseTemplate responseTemplate = new ResponseTemplate();
        responseTemplate.setCustomer(null);
        responseTemplate.setAddress(null);
        return responseTemplate;

    }
}



