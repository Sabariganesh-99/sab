package com.example.demo;


import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.*;

@Service
public interface ICustomerService {
void addCustomer (Customer customer);
List <Customer> fetchAll( );

void delCustomer (int id);
void updateCustomer(Customer customer);
Customer fetchById(int id);
}
