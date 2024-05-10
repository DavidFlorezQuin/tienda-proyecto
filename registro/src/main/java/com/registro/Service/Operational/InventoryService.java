package com.registro.Service.Operational;

import com.registro.DTO.Operational.IInventoryDto;
import com.registro.Entity.Operational.Inventory;
import com.registro.IRepository.IBaseRepository;
import com.registro.IRepository.Operational.IInventoryRepository;
import com.registro.IService.Operational.IInventoryService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService extends ABaseService<Inventory> implements IInventoryService {

    @Autowired
    private IInventoryRepository repository;

    @Override
    public List<IInventoryDto> getList() {
        return repository.getList();
    }

    @Override
    protected IBaseRepository<Inventory, Long> getRepository() {
        return repository;
    }
}
