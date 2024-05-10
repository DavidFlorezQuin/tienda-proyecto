package com.registro.IService.Operational;

import com.registro.DTO.Operational.IProductDto;
import com.registro.Entity.Operational.Product;
import com.registro.IService.IBaseService;

import java.util.List;

public interface IProductService extends IBaseService<Product> {

    List<IProductDto> getList();
}
