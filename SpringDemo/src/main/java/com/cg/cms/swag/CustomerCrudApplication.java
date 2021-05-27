package com.cg.cms.swag;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cms.entities.Customer;
import com.cg.cms.service.ICustomerService;

import io.swagger.annotations.ApiOperation;

@RestController
@SpringBootApplication
public class CustomerCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerCrudApplication.class, args);
	}

}
