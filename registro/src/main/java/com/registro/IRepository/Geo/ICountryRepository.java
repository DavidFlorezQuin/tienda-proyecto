package com.registro.IRepository.Geo;

import java.util.List;

import com.registro.DTO.Geo.ICountryDto;
import com.registro.Entity.Geo.Country;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends IBaseRepository<Country, Long> {

	@Query(value = " SELECT "
			+ "	id,"
			+ "	name,"
			+ " code, "
			+ " state "
			+ "	FROM "
			+ "	country "
			+ "	WHERE "
			+ " deleted_at IS NULL", nativeQuery = true)
	List<ICountryDto> getList();
}
