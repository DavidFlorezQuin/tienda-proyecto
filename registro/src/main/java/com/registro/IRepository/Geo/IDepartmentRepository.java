package com.registro.IRepository.Geo;

import java.util.List;

import com.registro.DTO.Geo.IDepartmentDto;
import com.registro.Entity.Geo.Department;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface IDepartmentRepository extends IBaseRepository<Department, Long> {


	 @Query(value = " SELECT "
			 + " id,"
			 + " name,"
			 + " code, "
			 + " state "
			 + " FROM "
			 + " department "
			 + " WHERE "
			 + " deleted_at IS NULL", nativeQuery = true)
	 List<IDepartmentDto> getList();
}
