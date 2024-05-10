package com.registro.DTO.Operational;

import com.registro.DTO.IGenericDto;

public interface ISupplyProductDto extends IGenericDto {

    String getQuantity();
    String getSupply();
    String getProduct();

}
