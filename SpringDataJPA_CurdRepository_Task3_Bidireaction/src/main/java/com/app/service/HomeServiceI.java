package com.app.service;

import java.util.List;



import com.app.model.Department;

public interface HomeServiceI {

	
	public Department addData(Department dep);
	
	public List<Department> getAll(Department dep);
	
	public String deleteAll ();
	
	public Department getSingle(int did);
	
	public List<Department> delete(int did);
	
	public List<Department> addAll(List<Department> list);
	
	public Department update(Department d);
	
	public Department updateName(int did, String dname);
}
