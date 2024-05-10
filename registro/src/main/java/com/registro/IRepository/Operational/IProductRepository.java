package com.registro.IRepository.Operational;

import com.registro.DTO.Operational.IProductDto;
import com.registro.Entity.Operational.Product;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends IBaseRepository<Product, Long> {

    @Query(value = " SELECT "
            + " id, "
            + " name, "
            + " description, "
            + " code, "
            + " price, "
            + " state"
            + " FROM "
            + " product "
            + " WHERE "
            + " deleted_at IS NULL", nativeQuery = true)
            List<IProductDto> getList();
}
