package com.registro.DTO.Operational;

import com.registro.DTO.IGenericDto;

public interface IInvoiceDto extends IGenericDto{

    String getTotal();
    String getDate();

    String getPerson();

}
