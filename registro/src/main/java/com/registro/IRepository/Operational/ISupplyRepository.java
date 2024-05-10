package com.registro.IRepository.Operational;

import com.registro.DTO.Operational.IProductDto;
import com.registro.DTO.Operational.ISupplyDto;
import com.registro.Entity.Operational.Supply;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISupplyRepository extends IBaseRepository<Supply, Long> {

    @Query(value = " SELECT "
            + " s.name, "
            + " s.description, "
            + " u.name, "
            + " s.state"
            + " FROM "
            + " supply s "
            + " INNER JOIN "
            + " unit_measurement u"
            + " WHERE "
            + " s.deleted_at IS NULL", nativeQuery = true)
    List<ISupplyDto> getList();
}
