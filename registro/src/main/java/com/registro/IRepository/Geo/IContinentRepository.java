package com.registro.IRepository.Geo;

import com.registro.DTO.Geo.IContinentDto;
import com.registro.Entity.Geo.Continent;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IContinentRepository extends IBaseRepository<Continent, Long> {

    @Query(value = " SELECT "
            + "	id,"
            + "	name,"
            + " code, "
            + " state "
            + "	FROM "
            + "	continent "
            + "	WHERE "
            + " deleted_at IS NULL", nativeQuery = true)
    List<IContinentDto> getList();
}
