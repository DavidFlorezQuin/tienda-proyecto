package com.registro.Service.Geo;

import com.registro.DTO.Geo.IContinentDto;
import com.registro.Entity.Geo.Continent;
import com.registro.IRepository.Geo.IContinentRepository;
import com.registro.IRepository.IBaseRepository;
import com.registro.IService.Geo.IContinentService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService extends ABaseService<Continent> implements IContinentService {

    @Autowired
    IContinentRepository repository;

    @Override
    protected IBaseRepository<Continent, Long> getRepository() {
        return repository;
    }

    @Override
    public List<IContinentDto> getList() {
        return repository.getList();
    }
}
