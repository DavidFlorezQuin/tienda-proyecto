package com.registro.IRepository.Operational;

import com.registro.DTO.Operational.IDetailPriceDto;
import com.registro.DTO.Operational.IInvoiceDetailDto;
import com.registro.DTO.Operational.ISupplyProductInvoiceDto;
import com.registro.Entity.Operational.InvoiceDetail;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IInvoiceDetailRepository extends IBaseRepository<InvoiceDetail, Long> {

    @Query(value = "SELECT"
            + " p.name as nombre, "
            + " p.price, "
            + " id.quantity, "
            + " i.total as pagar "
            + " FROM "
            + " invoice_detail id"
            + " INNER JOIN "
            + " product p"
            + " ON"
            + " p.id = id.product_id"
            + " INNER JOIN "
            + " invoice i"
            + " ON"
            + " i.id = id.invoice_id"
            + " WHERE "
            + " id.deleted_at IS NULL", nativeQuery = true)
    List<IInvoiceDetailDto> getList();


    @Query(value = "SELECT"
            + " i.id, "
            + " id.state, "
            + " p.name as name, "
            + " p.price, "
            + " id.quantity, "
            + " p.price * id.quantity AS totalProduct"
            + " FROM "
            + " invoice_detail id"
            + " INNER JOIN "
            + " product p"
            + " ON"
            + " p.id = id.product_id"
            + " INNER JOIN "
            + " invoice i"
            + " ON"
            + " i.id = id.invoice_id"
            + " WHERE "
            + " id.invoice_id = :id "
            + " AND "
            + " id.deleted_at IS NULL", nativeQuery = true)
    List<IInvoiceDetailDto> getDetailData(Long id);

    @Query(value = "SELECT "
            + " inde.invoice_id AS invoice,"
            + " sp.quantity AS quantity,"
            + " p.name AS productName,"
            + " s.name AS supplyName,"
            + " inde.quantity * sp.quantity AS totalSupply"
            + " FROM invoice i"
            + " INNER JOIN"
            + " invoice_detail inde ON i.id = inde.invoice_id"
            + " INNER JOIN"
            + " product p ON p.id = inde.product_id"
            + " INNER JOIN"
            + " supply_product sp ON p.id = sp.product_id"
            + " INNER JOIN"
            + " supply s ON s.id = sp.supply_id"
            + " WHERE inde.invoice_id = :id", nativeQuery = true)
            List<ISupplyProductInvoiceDto> getSupplyInvoiceDetail(Long id);

}
