package com.registro.Service.Operational;

import com.registro.DTO.Operational.ISupplyDto;
import com.registro.Entity.Operational.Supply;
import com.registro.IRepository.IBaseRepository;
import com.registro.IRepository.Operational.ISupplyRepository;
import com.registro.IService.Operational.ISupplyService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class SupplyService extends ABaseService<Supply> implements ISupplyService {

    @Autowired
    private ISupplyRepository repository;

    @Override
    public List<ISupplyDto> getList() {
        return repository.getList();
    }

    @Override
    protected IBaseRepository<Supply, Long> getRepository() {
        return repository;
    }
}
