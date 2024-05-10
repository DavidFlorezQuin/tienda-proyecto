package com.registro.IRepository.Operational;

import com.registro.DTO.Operational.IInvoiceDetailDto;
import com.registro.DTO.Operational.ISupplyProductDto;
import com.registro.Entity.Operational.Supply;
import com.registro.Entity.Operational.SupplyProduct;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISupplyProductRepository extends IBaseRepository<SupplyProduct, Long> {

    @Query(value = "SELECT"
            + " sp.quantity, "
            + " s.name, "
            + " p.name "
            + " FROM "
            + " supply_product sp"
            + " INNER JOIN "
            + " product p"
            + " ON"
            + " p.id = id.product_id"
            + " INNER JOIN "
            + " supply s"
            + " ON"
            + " s.id = sp.supply_id"
            + " WHERE "
            + " sp.deleted_at IS NULL", nativeQuery = true)
    List<ISupplyProductDto> getList();

    @Query(value = "SELECT"
            + " sp.id, "
            + " sp.state, "
            + " sp.quantity, "
            + " s.name AS supply, "
            + " p.name AS product"
            + " FROM "
            + " supply_product sp"
            + " INNER JOIN "
            + " product p"
            + " ON"
            + " p.id = sp.product_id"
            + " INNER JOIN "
            + " supply s"
            + " ON"
            + " s.id = sp.supply_id"
            + " WHERE "
            + " sp.product_id = :id "
            + " AND "
            + " sp.deleted_at IS NULL", nativeQuery = true)
    List<ISupplyProductDto> getSupplyProduct(Long id);
}
