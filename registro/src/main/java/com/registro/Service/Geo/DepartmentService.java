package com.registro.Service.Geo;

import java.util.List;


import com.registro.DTO.Geo.IDepartmentDto;
import com.registro.Entity.Geo.Department;
import com.registro.IRepository.Geo.IDepartmentRepository;
import com.registro.IRepository.IBaseRepository;
import com.registro.IService.Geo.IDepartmentService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService  extends ABaseService<Department> implements IDepartmentService {

	
	@Autowired
	public IDepartmentRepository repository;

	@Override
	protected IBaseRepository<Department, Long> getRepository() {
		return repository;
	}
	@Override
	public List<IDepartmentDto> getList() {
		return repository.getList();
	}
}

