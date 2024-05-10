package com.registro.IRepository.Operational;

import com.registro.DTO.Operational.IUnitMeasurementDto;
import com.registro.Entity.Operational.UnitMeasurement;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUnitMeasurementRepository extends IBaseRepository<UnitMeasurement, Long> {

    @Query(value = " SELECT "
            + " name, "
            + " code, "
            + " state"
            + " FROM "
            + " unit_measurement "
            + " INNER JOIN "
            + " WHERE "
            + " deleted_at IS NULL", nativeQuery = true)
    List<IUnitMeasurementDto> getList();
}
