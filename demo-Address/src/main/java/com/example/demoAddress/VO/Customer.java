package com.example.demoAddress.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    int ID;
    String LAST;
    String FIRST;
    String MOBILE;
    String HOMEPHONE;
    String OFFICE_EMAIL;
    String PERSONAL_EMAIL;
    String STATUS;


}
