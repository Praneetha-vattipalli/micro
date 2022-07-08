package com.example.demoAddress.Repo;

import com.example.demoAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {




    Address findByID(int id);
}
