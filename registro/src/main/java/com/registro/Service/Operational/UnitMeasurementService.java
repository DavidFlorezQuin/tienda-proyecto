package com.registro.Service.Operational;

import com.registro.DTO.Operational.IUnitMeasurementDto;
import com.registro.Entity.Operational.UnitMeasurement;
import com.registro.IRepository.IBaseRepository;
import com.registro.IRepository.Operational.IUnitMeasurementRepository;
import com.registro.IService.Operational.IUnitMeasurementService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitMeasurementService extends ABaseService<UnitMeasurement> implements IUnitMeasurementService {

    @Autowired
    private IUnitMeasurementRepository repository;

    @Override
    public List<IUnitMeasurementDto> getList() {
        return repository.getList() ;
    }

    @Override
    protected IBaseRepository<UnitMeasurement, Long> getRepository() {
        return repository;
    }
}
