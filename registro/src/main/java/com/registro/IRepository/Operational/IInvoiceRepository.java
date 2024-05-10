package com.registro.IRepository.Operational;

import com.registro.DTO.Operational.IInvoiceDto;
import com.registro.DTO.Operational.IInvoicePriceDto;
import com.registro.Entity.Operational.Invoice;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IInvoiceRepository extends IBaseRepository<Invoice, Long> {

    @Query(value = " SELECT "
                 + " i.id, "
                 + " i.total, "
                 + " i.created_at AS date, "
                 + " p.first_name AS person "
                 + " FROM "
                 + " invoice i"
                 + " INNER JOIN "
                 + " client c "
                 + " ON "
                 + " c.id = i.client_id"
                 + " INNER JOIN "
                 + " person p "
                 + " ON "
                 + " p.id = c.person_id", nativeQuery = true)
    List<IInvoiceDto> getList();

    @Query(value = "SELECT "
            + " i.id AS id, "
            + " i.state AS state, "
            + " SUM(inde.quantity * p.price) AS totalPrice "
            + " FROM invoice i "
            + " INNER JOIN invoice_detail inde ON i.id = inde.invoice_id "
            + " INNER JOIN product p ON p.id = inde.product_id "
            + " WHERE inde.invoice_id = :id "
            + " GROUP BY i.id, i.state", nativeQuery = true)
    Optional<IInvoicePriceDto> getTotalPrice(Long id);




}
