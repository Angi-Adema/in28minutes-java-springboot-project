package com.in28minutes.spring.learn_spring_framework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.learn_spring_framework.enterprise.example.data.DataService;

@Component
public class BusinessService {
	
	@Autowired
	private DataService dataService;
	
//  Example of constructor injection. Which injection method is the best? Spring recommends constructor injection 
//  because all of the dependencies can be set through the parameters. Just with one method call, one constructor initialization,
//  your entire object is ready for use. Also do not need to worry about whether the autowired has taken place as it will be sure it is.
	// @Autowired  DON'T HAVE TO HAVE THIS HERE, CAN PUT IT ABOVE ON THE FIELD.
	public BusinessService(DataService dataService) {
		super();
		System.out.println("Constructor Injection");  // Added this to confirm that Spring is utilizing the constructor injection and autowired completed.
		this.dataService = dataService;
	}


//  Example of setter injection.	
//	@Autowired
//	public void setDataService(DataService dataService) {
//		System.out.println("Setter Injection");
//		this.dataService = dataService;
//	}

	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
		
	}
 }

