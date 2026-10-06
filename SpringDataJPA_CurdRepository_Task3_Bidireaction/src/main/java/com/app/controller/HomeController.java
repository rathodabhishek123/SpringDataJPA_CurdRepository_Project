package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Department;
import com.app.service.HomeServiceI;

@RestController
public class HomeController {

	@Autowired
	private HomeServiceI hs;
	
	@PostMapping("/add")
	public Department addData(@RequestBody Department dep) {
		
		Department data = hs.addData(dep);
		
		return data;
	}
	
	@GetMapping("/getall")
	public List<Department> getAll(@RequestBody Department dep){
		
		List<Department> all = hs.getAll(dep);
		
		return all;
	}
	
	@DeleteMapping("/deleteall")
	public String deleteAll() {
		
		 hs.deleteAll();
		return "Delate All Data Successfully..!";
	}
	
	@GetMapping("/getsingle/{did}")
	public Department getSingle(@PathVariable int did) {
		
		Department single = hs.getSingle(did);
		return single;
	}
	
	@DeleteMapping("/delete/{did}")
	public List<Department> delete(@PathVariable int did){
		
		List<Department> list = hs.delete(did);
		
		return list;
	}
	
	@PostMapping("/addlist")
	public List<Department> addAll(@RequestBody List<Department> list){
		
		List<Department> all = hs.addAll(list);
		
		return all;
		
	}
	
	@PutMapping("/update")
	public Department update(@RequestBody Department d) {
		
		Department update = hs.update(d);
		
		return update;
		
	}
	
	
	@PatchMapping("/updateName/{did}")
	public Department updateName(@PathVariable int did, @RequestBody String dname) {

	    Department dep = hs.updateName(did, dname);

	    return dep;
	}
	
	
}
