package com.example.demoAddress.VO;

import com.example.demoAddress.model.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {

    private Address address;
    private Customer customer;
}

