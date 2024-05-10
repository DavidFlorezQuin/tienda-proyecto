package com.registro.DTO.Operational;

import com.registro.DTO.IGenericDto;

public interface IProductDto extends IGenericDto {

    String getName();
    String getCode();
    String getDescription();
    String getPrice();
}
