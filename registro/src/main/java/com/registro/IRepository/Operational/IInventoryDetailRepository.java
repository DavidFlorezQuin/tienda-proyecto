package com.registro.IRepository.Operational;

import com.registro.DTO.Operational.IInventoryDetailDto;
import com.registro.Entity.Operational.InventoryDetail;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IInventoryDetailRepository extends IBaseRepository<InventoryDetail, Long> {

    @Query(value = "SELECT"
            + " s.name, "
            + " i.name "
            + " FROM "
            + " inventory_detail id"
            + " INNER JOIN "
            + " supply s"
            + " ON"
            + " s.id = id.supply_id"
            + " INNER JOIN "
            + " inventory i"
            + " ON"
            + " i.id = id.inventory_id"
            + " WHERE "
            + " id.deleted_at IS NULL", nativeQuery = true)
    List<IInventoryDetailDto> getList();
}
