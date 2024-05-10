package com.registro.IService.Geo;

import java.util.List;

import com.registro.DTO.Geo.IDepartmentDto;
import com.registro.Entity.Geo.Department;
import com.registro.IService.IBaseService;

public interface IDepartmentService extends IBaseService<Department> {
	 List<IDepartmentDto> getList();
}
