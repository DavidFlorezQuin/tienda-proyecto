package com.registro.Service.Operational;

import com.registro.DTO.Operational.ISupplyProductDto;
import com.registro.Entity.Operational.Supply;
import com.registro.Entity.Operational.SupplyProduct;
import com.registro.IRepository.IBaseRepository;
import com.registro.IRepository.Operational.ISupplyProductRepository;
import com.registro.IService.Operational.ISupplyProductService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class SupplyProductService extends ABaseService<SupplyProduct> implements ISupplyProductService {

    @Autowired
    ISupplyProductRepository repository;

    @Override
    public List<ISupplyProductDto> getList() {
        return repository.getList();
    }

    @Override
    public List<ISupplyProductDto> getSupplyProduct(Long id) {
        return repository.getSupplyProduct(id);
    }

    @Override
    protected IBaseRepository<SupplyProduct, Long> getRepository() {
        return repository;
    }
}
