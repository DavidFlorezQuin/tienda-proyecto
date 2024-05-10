package com.registro.IRepository.Operational;

import com.registro.DTO.Operational.IInventoryDto;
import com.registro.DTO.Operational.IProductDto;
import com.registro.Entity.Operational.Inventory;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IInventoryRepository extends IBaseRepository<Inventory, Long> {

    @Query(value = "SELECT"
            + " name, "
            + " state "
            + " FROM "
            + " inventory "
            + " WHERE "
            + " deleted_at IS NULL", nativeQuery = true)
            List<IInventoryDto> getList();
}
