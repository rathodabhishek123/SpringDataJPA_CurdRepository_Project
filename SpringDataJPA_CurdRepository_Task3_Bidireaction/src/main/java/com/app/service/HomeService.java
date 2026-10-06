package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.model.Department;
import com.app.model.Employee;
import com.app.repository.HomeRepoI;

@Service
public class HomeService implements HomeServiceI {

	@Autowired
	private HomeRepoI hr;

	@Override
	public Department addData(Department dep) {

		for (Employee emp : dep.getList()) {
			emp.setDep(dep);
		}

		return hr.save(dep);
	}

	@Override
	public List<Department> getAll(Department dep) {

		List<Department> all = (List<Department>) hr.findAll();

		return all;
	}

	@Override
	public String deleteAll() {

		hr.deleteAll();

		return "Deleted";
	}

	@Override
	public Department getSingle(int did) {

		Optional<Department> id = hr.findById(did);

		if (id.isPresent()) {

			Department department = id.get();
			return department;
		}

		return null;
	}

	@Override
	public List<Department> delete(int did) {

		hr.deleteById(did);

		List<Department> all = (List<Department>) hr.findAll();

		return all;
	}

	@Override
	public List<Department> addAll(List<Department> list) {

		for (Department d : list) {

			List<Employee> list2 = d.getList();

			for (Employee emp : list2) {

				emp.setDep(d);
			}
		}

		List<Department> saveAll = (List<Department>) hr.saveAll(list);

		return saveAll;
	}

	@Override
	public Department update(Department d) {

		Department update = hr.save(d);

		return update;
	}

	@Override
	public Department updateName(int did, String dname) {

		Department dep = hr.findById(did).get();

		dep.setDname(dname);

		Department save = hr.save(dep);

		return save;

	}

}
