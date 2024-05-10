package com.registro.Service.Operational;

import com.registro.DTO.Operational.IInventoryDetailDto;
import com.registro.Entity.Operational.InventoryDetail;
import com.registro.IRepository.IBaseRepository;
import com.registro.IRepository.Operational.IInventoryDetailRepository;
import com.registro.IService.Operational.IInventoryDetailService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryDetailService extends ABaseService<InventoryDetail> implements IInventoryDetailService {

    @Autowired
    private IInventoryDetailRepository repository;

    @Override
    public List<IInventoryDetailDto> getList() {
        return repository.getList();
    }

    @Override
    protected IBaseRepository<InventoryDetail, Long> getRepository() {
        return repository;
    }
}
