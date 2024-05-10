package com.registro.IRepository.Security;

import java.util.List;

import com.registro.DTO.Security.IRoleDto;
import com.registro.Entity.Security.Role;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface IRoleRepository extends IBaseRepository<Role, Long> {

	@Query(value = " SELECT "
			+ "	id,"
			+ "	name as role,"
			+ " description, "
			+ " state "
			+ "	FROM "
			+ "	role "
			+ "	WHERE "
			+ " deleted_at IS NULL", nativeQuery = true)
	List<IRoleDto> getList();


}
