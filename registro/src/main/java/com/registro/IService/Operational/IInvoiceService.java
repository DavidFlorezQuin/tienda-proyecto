package com.registro.IService.Operational;

import com.registro.DTO.Operational.IInvoiceDto;
import com.registro.DTO.Operational.IInvoicePriceDto;
import com.registro.Entity.Operational.Invoice;
import com.registro.IService.IBaseService;

import java.util.List;
import java.util.Optional;

public interface IInvoiceService extends IBaseService<Invoice> {
    List<IInvoiceDto> getList();
    Optional<IInvoicePriceDto> getTotalPrice(Long id);

}
