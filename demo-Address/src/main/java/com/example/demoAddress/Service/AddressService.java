package com.example.demoAddress.Service;

import com.example.demoAddress.Repo.AddressRepo;
import com.example.demoAddress.VO.Customer;
import com.example.demoAddress.VO.ResponseTemplate;
import com.example.demoAddress.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepo ar;
   public Address getAddress(int OBJECT_ID) {
         Address addr=ar.findByID(OBJECT_ID);
        return addr;
   }
    @Autowired
    RestTemplate restTemplate;
    public ResponseTemplate address(int  ID){
        ResponseTemplate r=new ResponseTemplate();
        Address address = ar.findByID(ID);
      Customer customer= restTemplate.getForObject("http://CUSTOMER-SERVICE/api/customer/" + address.getOBJECT_ID(),
              Customer.class);
        r.setCustomer(customer);
        r.setAddress(address);
        return r;
    }
    public List<Address> getAddress() {
       List<Address> add=ar.findAll();
         return add;
    }

}
