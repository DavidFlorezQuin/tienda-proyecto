package com.registro.IRepository.Security;

import java.util.List;

import com.registro.DTO.Security.IViewDto;
import com.registro.Entity.Security.View;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface IViewRepository extends IBaseRepository<View, Long> {

	@Query(value = " SELECT "
			+ "	id,"
			+ "	name as view,"			
			+ " description, "
			+ " route, "
			+ " state "
			+ "	FROM "
			+ "	view "
			+ "	WHERE "
			+ " deleted_at IS NULL", nativeQuery = true)
		List<IViewDto> getList();


}
