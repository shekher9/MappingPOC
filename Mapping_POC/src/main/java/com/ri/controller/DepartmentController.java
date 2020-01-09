package com.ri.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ri.entity.DepartmentEntity;
import com.ri.model.Department;
import com.ri.response.DepartmentResponse;
import com.ri.service.DepartmentService;

@RestController
@RequestMapping("/dept")
@Consumes(value = {})
public class DepartmentController {
	
	@Autowired(required = true)
	private DepartmentService deptservice;
	
	
	  @PostMapping(value = "/save",consumes = "media")
	  public ResponseEntity<DepartmentResponse> registerNewDepartment(@RequestBody Department dep){
		 DepartmentEntity entity=new DepartmentEntity();
		 DepartmentResponse response=null;
		 BeanUtils.copyProperties(dep, entity);
		  int id=deptservice.saveNewDepartment(entity);
		  if(id!=0) {
			  response=DepartmentResponse.builder().deptid(id).status(HttpStatus.OK).message("New Depaetment added").build();
		  }
		  else 
			  response=DepartmentResponse.builder().deptid(0).status(HttpStatus.INTERNAL_SERVER_ERROR).message("DEpartment is not added").build();
		 
		  
		  return ResponseEntity.ok(response);
	  
	  }
	  
	  @GetMapping("/getalldepartment")
	  public List<Department> getAllDepartment(){
		  List<Department> deptlist=new ArrayList<Department>();
		  
		  List<DepartmentEntity> entityList=deptservice.getAllDepartment();
		  entityList.forEach(entity->{
			  Department dept=new Department();
			  BeanUtils.copyProperties(entity, dept);
			  deptlist.add(dept);
		  });
		  
		  return deptlist;
				  
	  }
	  
	  @GetMapping("/getDepartment/{id}")
	  public Department getDepartmentById(@PathParam(value = "id") int id) {
		  Department dept=new Department();
		  DepartmentEntity entity=deptservice.getDepartmentById(id);
		  BeanUtils.copyProperties(entity, dept);
		  return dept;
		  
	  }
	  
	 

}
