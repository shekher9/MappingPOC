package com.ri.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ri.entity.EmployeeEntity;
import com.ri.model.EmployeeModel;
import com.ri.response.EmployeeResponse;
import com.ri.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired(required = true)
	private EmployeeService empservice;
	
	@PostMapping("/newRegister")
	public ResponseEntity<EmployeeResponse> registerNewEmployee(@RequestBody EmployeeModel model){
		EmployeeResponse response=null;
		Map<String,String> map;
		EmployeeEntity entity=new EmployeeEntity();
		BeanUtils.copyProperties(model, entity);
		map=empservice.saveNewEmployee(entity);
		if(map.containsKey("Success")) {
			response=EmployeeResponse.builder().empid(map.get("Success")).ststus(HttpStatus.OK).message("Employee Data Saved").build();
		}
		else
			response=EmployeeResponse.builder().ststus(HttpStatus.OK).message("Employee Data Not saved").build();
		
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/getAllEmployee")
	public List<EmployeeModel> getAllemployee(){
		 List<EmployeeModel> modelList=new ArrayList<EmployeeModel>();
		 List<EmployeeEntity> empList=empservice.getAllEmployee();
		 empList.forEach(emp->{
			 EmployeeModel model=new EmployeeModel();
			 BeanUtils.copyProperties(emp, model);
			 modelList.add(model);
		 });
		 return modelList;
	}
	
	@GetMapping("/getemployee/{employeeid}")
	public EmployeeModel fechEmployeeByEmployeeId(@PathParam(value = "employeeid") String employeeid) {
		return  empservice.getEmployeeById(employeeid);
		
	}
	

}
