package com.registro.IRepository.Geo;

import java.util.List;

import com.registro.DTO.Geo.ICityDto;
import com.registro.Entity.Geo.City;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ICityRepository extends IBaseRepository<City, Long> {

	@Query(value = " SELECT "
			+ "	id,"
			+ "	name,"
			+ " code, "
			+ " state "
			+ "	FROM "
			+ "	city "
			+ "	WHERE "
			+ " deleted_at IS NULL", nativeQuery = true)
		List<ICityDto> getList();
	
	
}
