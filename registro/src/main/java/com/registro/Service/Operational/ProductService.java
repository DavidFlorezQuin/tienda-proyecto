package com.registro.Service.Operational;

import com.registro.DTO.Operational.IProductDto;
import com.registro.Entity.Operational.Product;
import com.registro.IRepository.IBaseRepository;
import com.registro.IRepository.Operational.IProductRepository;
import com.registro.IService.Operational.IProductService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService extends ABaseService<Product> implements IProductService {

    @Autowired
    private IProductRepository repository;

    @Override
    public List<IProductDto> getList() {
        return repository.getList();
    }

    @Override
    protected IBaseRepository<Product, Long> getRepository() {
        return repository;
    }
}
