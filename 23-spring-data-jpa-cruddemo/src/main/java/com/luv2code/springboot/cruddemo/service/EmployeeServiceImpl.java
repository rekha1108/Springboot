package com.luv2code.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.AddressRepository;
//import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	
    @Autowired
    
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		
		this.employeeRepository = theEmployeeRepository;
	}

	@Override
	//@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	//@Transactional
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> result = employeeRepository.findById(id);
		
		Employee theEmployee = null;
		if(result.isPresent()) {
			theEmployee = result.get();
			return theEmployee;
		}
		else {
			throw new RuntimeException("DId not find the employee "+ id );
		}
	}

	@Override
	//@Transactional
	public void save(Employee theEmployee) {
		
		employeeRepository.save(theEmployee);

	}

	@Override
	//@Transactional
	public void deleteById(int id) {
		
		employeeRepository.deleteById(id);

	}
	
	

}
