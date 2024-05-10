package com.registro.DTO.Operational;

import com.registro.DTO.IGenericDto;

public interface IInvoiceDetailDto extends IGenericDto {

    String getName();
    Double getPrice();
    Integer getQuantity();
    String getTotalProduct();

}
