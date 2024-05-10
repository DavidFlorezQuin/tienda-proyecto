package com.registro.IRepository.Security;

import java.util.List;

import com.registro.DTO.Security.IModuleDto;
import com.registro.Entity.Security.Module;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface IModuleRepository extends IBaseRepository<Module, Long>{


	@Query(value = " SELECT "
			+ "	id,"
			+ "	name as module,"
			+ " route, "
			+ " description, "
			+ " state "
			+ "	FROM "
			+ "	module "
			+ "	WHERE "
			+ " deleted_at IS NULL", nativeQuery = true)
	List<IModuleDto> getList();


}
