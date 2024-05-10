package com.registro.IService.Operational;

import com.registro.DTO.Operational.ISupplyProductDto;
import com.registro.Entity.Operational.SupplyProduct;
import com.registro.IService.IBaseService;

import java.util.List;

public interface ISupplyProductService extends IBaseService<SupplyProduct> {

    List<ISupplyProductDto> getList();

    List<ISupplyProductDto> getSupplyProduct(Long id);
}
