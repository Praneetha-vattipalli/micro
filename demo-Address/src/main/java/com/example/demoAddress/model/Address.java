package com.example.demoAddress.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    int ID;
    int OBJECT_ID;
    String OBJECT_TYPE;
    String ADDR_TYPE;
    String STREET;
    String CITY ;
    String STATE;
    String ZIP ;
    String DATE_CREATED ;

}
