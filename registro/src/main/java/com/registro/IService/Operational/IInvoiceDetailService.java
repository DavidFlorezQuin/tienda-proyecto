package com.registro.IService.Operational;

import com.registro.DTO.Operational.IDetailPriceDto;
import com.registro.DTO.Operational.IInvoiceDetailDto;
import com.registro.DTO.Operational.ISupplyProductInvoiceDto;
import com.registro.Entity.Operational.InvoiceDetail;
import com.registro.IService.IBaseService;

import java.util.List;

public interface IInvoiceDetailService extends IBaseService<InvoiceDetail> {
    List<IInvoiceDetailDto> getList();

    List<IInvoiceDetailDto> getDetailData(Long id);

    List<ISupplyProductInvoiceDto> getSupplyInvoiceDetail(Long id);

}
